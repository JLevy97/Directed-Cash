import java.util.Map;

public class Abstractions {

    public static void main(String[] args){

        //as part of the output shows that a transaction
        //each transaction is in the DAG, not checked along the DAG

        //create DAG
        Double[][] DAG = DAGinterpreter.buildDAG();
        String[] KeyNames = DAGinterpreter.getKeyNames();
        Map<String,String> matches =DAGinterpreter.getMatches();

        for (int i=0;i<DAG.length;i++){
            for (int j=0;j<DAG[i].length;j++){
                System.out.print(DAG[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        //initialize ledger
        Ledger_proto largeLed = new Ledger_proto();
        Base_Ledger b = new Base_Ledger();
        Dynamic_Ledger d = new Dynamic_Ledger(DAG,KeyNames,matches);
        //create cluster
        Consensus_Cluster cc = new Consensus_Cluster(DAG,matches,largeLed);

        cc.addNode("test_1");
        cc.addNode("test_2");
        cc.addNode("test_3");
        cc.Elections();


        cc.Elections();
        cc.networklessRun();


    }

}
