import java.util.Map;

public class Abstractions {

    public static void main(String[] args){

        Ledger_proto a;


        //create DAG
        Double[][] DAG = DAGinterpreter.buildDAG();
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
        //create cluster
        Consensus_Cluster cc = new Consensus_Cluster(DAG,matches,largeLed);

        cc.addNode("test_1");
        cc.addNode("test_2");
        cc.addNode("test_3");
        cc.Elections();


        cc.networklessRun();
        cc.Elections();

    }

}
