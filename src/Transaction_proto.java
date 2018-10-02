import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.RuleContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 6/20/2018.
 */
public class Transaction_proto {

    TransactionTypes type;
    String timestamp;
    Boolean statusComplete;
    Account_proto callerAccount;
    Transaction_Block_proto transBlock;
    ArrayList<Condition> conditions;
    String QueryString;
    //Consensus_Node transCreator;

    //gen constructors here
    public Transaction_proto(RuleContext T, fullQParser parser, Account_proto caller){

        statusComplete = false;
        callerAccount = caller;
        conditions = new ArrayList<Condition>();

        if (T.toStringTree(parser).contains("DONATE")){
            type = TransactionTypes.DONTATE;
        }else if(T.toStringTree(parser).contains("FIND")){
            type = TransactionTypes.FIND;
        }else if(T.toStringTree(parser).contains("RATING")){
            type = TransactionTypes.RATING;
        }else if(T.toStringTree(parser).contains("EXPENSE")){
            type = TransactionTypes.EXPENSE;
        }else if(T.toStringTree(parser).contains("CALL")){
            type = TransactionTypes.CALL;
        }else if(T.toStringTree(parser).contains("DEFINE")){
            type = TransactionTypes.DEFINE;
        }else{
            type = TransactionTypes.BID;
        }

        //upon creation of a donation/call/project/bid/expense --> create the appropriate freelist blocks
        System.out.println(T.toString(parser));
        System.out.println(T.toStringTree(parser));
        RuleContext child = (RuleContext)T.getChild(0).getPayload();
        //TreeRecursion(child,parser);
        System.out.println(child.toString(parser));
        child = (RuleContext)child.getChild(0).getPayload();
        System.out.println(child.toString(parser));
    }

    private void TreeRecursion(RuleContext T, fullQParser parser){
        //System.out.println(T.toString(parser));
    }

    public void setStatusComplete(boolean complete){
        statusComplete = complete;
    }

}
