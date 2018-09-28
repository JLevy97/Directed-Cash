/**
 * Created by User on 6/22/2018.
 */
public class User_Node {

    public static void main(String[] args){
        //start-up for user and actions.


        int rand = (int) (Math.random() * 3) + 1;
        String Query = CreateQ(rand);

    }

    /**
     *
     * @return randomly determines a set of pre-defined queries with the ANTLR grammars
     */
    public static String CreateQ(int rand){
        String q = "";
        if (rand == 1){
            q = createDonorQ();
        }else if (rand == 2){
            q = createAggregatorQ();
        }else{
            q = createVendorQ();
        }
        return q;
    }

    public static String createDonorQ(){

        String DQ = "FROM anon ID=8 TIMESTAMP 2018-02-12T20:53:00 DONATE $100 MONTHLY 3-10-17 TO 3-10-18 DECIDE FCFS WHERE SCHEMA=1 AND CATEGORY=FOOD REPORT ONCE";
        //int type = (int)(Math.random()*3)+1;


        return DQ;
    }

    public static String createAggregatorQ(){

        String AQ = "FROM brightraycharity ID=7 DEFINE PROJECT fooddrive GOAL $10000 WHERE SCHEMA=1 AND CATEGORY=FOOD";
        //int type = (int)(Math.random()*3)+1;

        return AQ;
    }

    public static String createVendorQ(){

        String VQ = "FROM freshhousegrocery ID=3 BID $550 TO brightraycharity WHERE SCHEMA=1 AND PROJECT= fooddrive 2018 AND CATEGORY=FOOD URL http";

        return VQ;
    }
}
