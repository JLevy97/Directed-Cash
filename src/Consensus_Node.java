import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 6/22/2018.
 */
public class Consensus_Node { //possible leader nodes that interact with the ledger

    static int Serial;

    boolean isLeader;
    int current_look;
    Consensus_Node[] delegate_nodes; // not important for current state of project
    //find way to measure heartbeat??? or lifeline

    Ledger_proto blockchain;
    List<RuleContext> queryList;
    Consensus_Cluster Parent_cluster;

    Transaction_Manager tm;
    List<Transaction_proto> transactions;


    //implement
    public Consensus_Node(Ledger_proto L, Consensus_Cluster P){

        isLeader = false;
        blockchain = L;
        Parent_cluster = P;
        tm = new Transaction_Manager(blockchain);
        transactions = new ArrayList<>();

        current_look = 0;
    }

    public void updateLegder(Ledger_proto L){
        blockchain = L;
        tm.updateLedger(blockchain);
    }

    public Ledger_proto run(String Q,Account_proto caller){


        //String Query = "FROM brightraycharity ID=7 DEFINE PROJECT fooddrive GOAL $10000 WHERE SCHEMA=1 AND CATEGORY=FOOD";
        RuleContext q = AntlrParse.parse(Q);
        fullQParser f = AntlrParse.GetParser(Q);
        queryList.add(q);

        for (int i=current_look;i<queryList.size();i++){

            RuleContext command = queryList.get(i);

            //if the command is within DAG order, execute
            if (DAGinterpreter.validDAGOrder(blockchain,Parent_cluster.DAG,Parent_cluster.KeyNames, q, f)) {
                //execute command
                Transaction_proto test = new Transaction_proto(q, f, caller);
                tm.runTransaction(test);

            }else{
                System.out.println("transaction out of order");
                return blockchain;
            }

            current_look++;
        }

        return blockchain;
    }


}
