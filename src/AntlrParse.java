import org.antlr.runtime.debug.ParseTreeBuilder;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class AntlrParse {

    public static void main(String[] args){

        for (int i=0;i<1;i++) {

            Ledger_proto l = new Ledger_proto();
            Transaction_Manager tm = new Transaction_Manager(l);

            String q = "FROM brightraycharity ID=7 DEFINE PROJECT fooddrive GOAL $10000 WHERE SCHEMA=1 AND CATEGORY=FOOD";
            String don = "FROM jimmy ID=7 DONATE $ 20 MONTHLY 12-24-18 TO 6-24-18 DECIDE FCFS";
            String f = "FROM jimmy ID= 77 FIND PROJECT";
            String r = "FROM jimmy ID= 81 RATE kyle AS 6 / 10";
            String lo = "LOCATE PROJECT savior";
            String b = "FROM roxi ID=998 BID $ 100 TO kyle";
            String c = "FROM jimmy ID= 88 CALL PROJECT foodff VENDOR RFP $ 106";
            String ex = "FROM jimmy ID= 88 EXPENSE $ 40 TO VENDOR kenny";
            System.out.println(q);

            //memory and file, mal-input recorded as error
            //search capability

            //parse with donor query lang
            try {

                //parse through the definition
                //String source = "test.txt";
                CharStream cs = CharStreams.fromString(q);
                fullQLexer lexer = new fullQLexer(cs);
                CommonTokenStream tk = new CommonTokenStream(lexer);
                //ParseTreeBuilder builder = new ParseTreeBuilder("prog");
                fullQParser p = new fullQParser(tk);
                p.setBuildParseTree(true);
                RuleContext tree = p.newq();


                System.out.println("tree" + tree.toStringTree(p));

                Account_proto testAcc = new Account_proto();
                Transaction_proto test = new Transaction_proto(tree, p, testAcc);
                System.out.println(test.transBlock);

                Ledger_proto ledger = new Ledger_proto();

                Transaction_Manager transam = new Transaction_Manager(ledger);
                transam.runTransaction(test);

                cs = CharStreams.fromString(don);
                lexer = new fullQLexer(cs);
                tk = new CommonTokenStream(lexer);
                //builder = new ParseTreeBuilder("prog");
                p = new fullQParser(tk);
                p.setBuildParseTree(true);
                tree = p.newq();

                Transaction_proto test2 = new Transaction_proto(tree, p, testAcc);
                System.out.println(test2.transBlock);

                transam.runTransaction(test2);

                //System.out.println("chain:   "+transam.ledger.chain);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    public static fullQParser GetParser(String query){
        fullQParser ret = null;
        try {
            //source of string to parse
            //String source = "test.txt";
            CharStream cs = CharStreams.fromString(query);   //q.codePoints().mapToObj(c -> (char) c);  //CharStreams.fromFileName(source);
            fullQLexer lexer = new fullQLexer(cs);
            CommonTokenStream tk = new CommonTokenStream(lexer);
            ParseTreeBuilder builder = new ParseTreeBuilder("prog");
            ret = new fullQParser(tk);
        }catch (Exception e){
            e.printStackTrace();
        }

        return ret;

    }

    public static RuleContext parse(String query){
        RuleContext tree = null;
        try {
            //source of string to parse
            //String source = "test.txt";
            CharStream cs = CharStreams.fromString(query);   //q.codePoints().mapToObj(c -> (char) c);  //CharStreams.fromFileName(source);
            fullQLexer lexer = new fullQLexer(cs);
            CommonTokenStream tk = new CommonTokenStream(lexer);
            ParseTreeBuilder builder = new ParseTreeBuilder("prog");
            fullQParser p = new fullQParser(tk);
            p.setBuildParseTree(true);
            tree = p.newq();
            System.out.println("tree" + tree.toStringTree(p));
        }catch (Exception e){
            e.printStackTrace();
        }

        return tree;
    }


}
