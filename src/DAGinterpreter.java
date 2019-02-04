import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DAGinterpreter {

    //read in txt file of dag
    //first line = all names
    //split lines by ,
    //build ajd. matrix for dag
    public static int[][] buildDAG(){

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
        int[][] DAG = new int[DAGblocks.length][DAGblocks.length];

        String m = "DAG.txt";
        file = new File(m);
        try {

            Scanner sc = new Scanner(file);
            int i = 0;
            while (sc.hasNextLine()) {
                line=sc.nextLine();
                String[] DAGpart = line.split(",");
                for (int x=0;x<DAGpart.length;x++){
                    DAG[i][x] = Integer.parseInt(DAGpart[x]);
                }
                i++;
            }

        } catch (IOException e){
            e.printStackTrace();
        }

        return DAG;
    }

    //topological sort?
}
