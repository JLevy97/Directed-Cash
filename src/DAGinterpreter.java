import org.antlr.v4.runtime.RuleContext;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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

    public static Map<String,String> getMatches(){

        Map<String,String> m = new HashMap<String,String>();

        String source = "Matches.txt";
        File file = new File(source);
        try {

            Scanner sc = new Scanner(file);
            String line = "";
            while (sc.hasNextLine()) {
                line=sc.nextLine();
                String[] MacthPart = line.split(",");
                m.put(MacthPart[0],MacthPart[1]);
            }

            sc.close();

        } catch (IOException e){
            e.printStackTrace();
        }

        return m;
    }

    public static String[] getKeyNames(){
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
        return DAGblocks;
    }

    public static boolean validDAGOrder(Ledger_proto L, Double[][] DAG, String[] nameKey, RuleContext Q, fullQParser p){

        //find block type based on Query
        String Qstring = Q.toStringTree(p);
        System.out.println(Qstring);
        int index = -1;
        String type = "";
        for (int i = 0;i<nameKey.length;i++){
            if (Qstring.contains(nameKey[i])){
                index = i;
                type = nameKey[i];
            }
        }

        if (index == -1){
            return false;
        }

        //check if block has a prerequisite based on the DAG
        ArrayList<Integer> preReq = new ArrayList();
        for (int i=0;i<DAG.length;i++){
            if (DAG[i][index]==1){
                preReq.add(i);
            }
        }

        //need to change the way that names are inputed so that names can be compared for pre-requisites

        //if block has a prerequisite, check to make sure the pre-req exists--> return true if the case
        for (int i = 0;i<preReq.size();i++){
            int j = preReq.get(i);
            String T = nameKey[j]; //what the type pf the requirement is

            if (T.equals("bid")){ //expenses are dependant on a bid
                for (int k = 0;k<L.allbids.size();k++){
                    if (L.allbids.get(k).name.equals(T)){
                        return true;
                    }
                }

            }else if (T.equals("call")){ //bids are dependant on calls
                for (int k = 0;k<L.allCalls.size();k++){
                    if (L.allCalls.get(k).name.equals(T)){
                        return true;
                    }
                }

            }else if (T.equals("define")){ //calls are dependant on projects existing
                for (int k = 0;k<L.allProjects.size();k++){
                    if (L.allProjects.get(k).name.equals(T)){
                        return true;
                    }
                }

            }else if (T.equals("LEDGER")){ //bubble ups are dependant on anything existing

            }else{ //all other types are the first steps
                return true;
            }
        }

        if (preReq.size() == 0){
            return true;
        }

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
