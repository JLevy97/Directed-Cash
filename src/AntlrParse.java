import org.antlr.runtime.debug.ParseTreeBuilder;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;


public class AntlrParse {

    public static void main(String[] args){

        for (int i=0;i<1;i++) {

            Account_proto testAcc = new Account_proto();

            Ledger_proto l = new Ledger_proto();
            Transaction_Manager tm = new Transaction_Manager(l);

            String q = "FROM brightraycharity ID=7 DEFINE PROJECT fooddrive GOAL $10000 WHERE SCHEMA=1 AND CATEGORY=FOOD";
            System.out.println(q);

            //memory and file, mal-imput recorded as error
            //search capability

            //parse with donor query lang
            try {

                //source of string to parse
                //String source = "test.txt";
                CharStream cs = CharStreams.fromString(q);   //q.codePoints().mapToObj(c -> (char) c);  //CharStreams.fromFileName(source);
                fullQLexer lexer = new fullQLexer(cs);
                CommonTokenStream tk = new CommonTokenStream(lexer);
                ParseTreeBuilder builder = new ParseTreeBuilder("prog");
                fullQParser p = new fullQParser(tk);
                p.setBuildParseTree(true);
                RuleContext tree = p.newq();

               /* MyfullQVisitor visitor= new MyfullQVisitor();
                Object Vreturn = visitor.visit(tree);
                System.out.println(Vreturn);*/

                System.out.println("tree" + tree.toStringTree(p));   //

                Transaction_proto test = new Transaction_proto(tree, p, testAcc);
                System.out.println(test);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

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
