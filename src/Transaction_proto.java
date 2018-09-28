import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.RuleContext;

import java.util.List;

/**
 * Created by User on 6/20/2018.
 */
public class Transaction_proto {

    TransactionTypes type;
    Boolean statusComplete;
    Account_proto callerAccount;
    Transaction_Block_proto transBlock;
    Consensus_Node transCreator;

    public Transaction_proto(){

    }

    //gen constructors here
    public Transaction_proto(RuleContext T, fullQParser parser){
        //upon creation of a donation/call/project/bid/expense --> create the appropriate freelist blocks
        System.out.println(T.toString(parser));
        RuleContext child = (RuleContext)T.getChild(0).getPayload();
        //TreeRecursion(child,parser);
        //System.out.println(child.toString(parser));


    }

    private void TreeRecursion(RuleContext T, fullQParser parser){
        //System.out.println(T.toString(parser));
    }

}
