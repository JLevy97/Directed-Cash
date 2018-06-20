import compiling.DonorQueryLexer;
import compiling.fullQParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class AntlrParse {

    public static void main(String[] args){

        for (int i=0;i<20;i++) {
            int rand = (int)(Math.random()*3)+1;
            String q = CreateQ(rand);
            System.out.println(q);
            if (rand == 1){
                //parse with donor query lang
                try {


                    //source of string to parse
                    String source = "test.txt";
                    CharStream cs = CharStreams.fromFileName(source);
                    DonorQueryLexer lexer = new DonorQueryLexer(cs);
                    CommonTokenStream tk = new CommonTokenStream(lexer);
                    fullQParser p = new fullQParser(tk);
                    ParseTree tree = p.newq();
                }catch (Exception e){
                    e.printStackTrace();
                }

            }else if (rand == 2){
                //parse with ag query lang
            }else{
                //parse with vendor query lang
            }
        }




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
