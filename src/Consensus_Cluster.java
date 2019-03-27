import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by User on 6/25/2018.
 */
public class Consensus_Cluster {

    static int Current_Beat = 0;

    List<Consensus_Node> cluster;
    List<Consensus_Node> addToClusterQueue;
    List<Account_proto> account_protos;
    Consensus_Node leader;
    //Consensus_Node[] delegates; future idea that has been given up on
    final SysManager sysManager = new SysManager(this);
    Double[][] DAG;
    String[] KeyNames;
    int[] DAGOrder;
    Ledger_proto ledger;
    boolean setElection;
    Map<String,String> matches;

    Account_proto testAcc = new Account_proto();

    public Consensus_Cluster(Double[][] dag, Map<String,String> m, Ledger_proto l){
        cluster = new ArrayList<>();
        addToClusterQueue = new ArrayList<>();
        account_protos = new ArrayList<>();
        leader = null;
        DAG = dag;
        DAGOrder = DAGinterpreter.topologicalSort(DAG);
        ledger = l;
        setElection = false;
        matches = m;
        //delegates = new Consensus_Node[2]; future idea that has been given up on
    }

    //////////////////////////////////////////////////////////// Functions for running the cluster

    //for starting the program without an outside entity
    public static void main(String[] args){

    }

    public void networklessRun(){

        //run the leader to the transactions following the DAG orders
        Scanner scan = new Scanner(System.in);
        System.out.println("enter Query");
        String Q = scan.nextLine();
        leader.Parent_cluster = this;

        Ledger_proto update = leader.run(Q,testAcc);


        System.out.println("REACH THIS");
        //update all the other nodes
        for (int i=0;i<cluster.size();i++){
            cluster.get(i).updateLegder(update);
        }

        Current_Beat++;

        if (Current_Beat%7==0){
            Elections();
        }

        /*heartbeat goes down, or timeout, set election is true
        if(){
            setElection = true;
        }*/
    }

    //////////////////////////////////////////////////////////// Functions for cluster operations
    public void addNode(String nodeName){

        //check with SYSADMIN??()


        Consensus_Node toAdd = new Consensus_Node(nodeName, ledger, this);
        //place a node in the queue
        addToClusterQueue.add(toAdd);
    }

    //adds all wanted nodes to cluster then randomly picks a new node to be the leader
    public void Elections(){

        //add all nodes in queue
        for (int i=0;i<addToClusterQueue.size();i++){
            cluster.add(addToClusterQueue.get(i));
        }
        addToClusterQueue.clear();

        //select a new node as the leader
        int newL = (int)(Math.random() * cluster.size());

        leader = cluster.get(newL);
        cluster.get(newL).isLeader=true;

    }


}
