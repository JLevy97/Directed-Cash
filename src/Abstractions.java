public class Abstractions {

    public static void main(String[] args){

        Ledger_proto a;
        Consensus_Cluster cc;

        //create DAG
        int[][] DAG = DAGinterpreter.buildDAG();

        //Topological sort??

        //create cluster
        //initialize cluster
        //initialize ledger
        

        for (int i=0;i<DAG.length;i++){
            for (int j=0;j<DAG[i].length;j++){
                System.out.print(DAG[i][j]);
            }
            System.out.println();
        }


    }

}
