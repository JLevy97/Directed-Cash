import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DAGinterpreter {

    //read in txt file of dag
    //first line = all names
    //split lines by ,
    //build ajd. matrix for dag
    public static Double[][] buildDAG(){

        String n = "DAGBLOCKS.txt";
        File file = new File(n);
        String line = "";
        try {

            Scanner sc = new Scanner(file);

            if (sc.hasNextLine()) {
                line=sc.nextLine();
            }

        } catch (IOException e){
            e.printStackTrace();
        }

        String[] DAGblocks = line.split(",");
        Double[][] DAG = new Double[DAGblocks.length][DAGblocks.length];

        String m = "DAG.txt";
        file = new File(m);
        try {

            Scanner sc = new Scanner(file);
            int i = 0;
            while (sc.hasNextLine()) {
                line=sc.nextLine();
                String[] DAGpart = line.split(",");
                for (int x=0;x<DAGpart.length;x++){
                    DAG[i][x] = Double.parseDouble(DAGpart[x]);
                }
                i++;
            }

        } catch (IOException e){
            e.printStackTrace();
        }

        return DAG;
    }

    public static boolean validDAGOrder(Ledger_proto L, int[][] DAG, int[] TP, String[] nameKey){

        //check if block has a prerequisite based on the DAG

        //if block has a prerequisite, check to make sure the pre-req exists--> return true if the case

        return false;
    }

    //TOPOLOGICAL SORT: CODE FROM --> https://github.com/williamfiset/Algorithms/blob/master/com/williamfiset/algorithms/graphtheory/TopologicalSortAdjacencyMatrix.java
    public static int[] topologicalSort(Double[][] adj) {

        // Setup
        int n = adj.length;
        boolean[] visited = new boolean[n];
        int[] order = new int[n];
        int index = n - 1;

        // Visit each node
        for (int u = 0; u < n; u++)
            if (!visited[u])
                index = visit(adj, visited, order, index, u);

        // Return topological sort
        return order;

    }

    private static int visit(Double[][] adj, boolean[] visited, int[] order, int index, int u) {

        if (visited[u]) return index;
        visited[u] = true;

        // Visit all neighbors
        for (int v = 0; v < adj.length; v++)
            if (adj[u][v] != null && !visited[v])
                index = visit(adj, visited, order, index, v);

        // Place this node at the head of the list
        order[index--] = u;

        return index;

    }
    // END OF TOP SORT  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
