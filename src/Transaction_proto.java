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
    String QueryString;
    String name;
    //Consensus_Node transCreator;

    //gen constructors here
    public Transaction_proto(RuleContext T, fullQParser parser, Account_proto caller){

        statusComplete = false;
        callerAccount = caller;
        QueryString = T.toStringTree(parser);

        if (T.toStringTree(parser).contains("DONATE")){
            type = TransactionTypes.DONTATE;
            transBlock = new Donate_Block(T.toStringTree(parser));  //constructor needed
        }else if(T.toStringTree(parser).contains("FIND")){
            type = TransactionTypes.FIND;
            transBlock = new Find_Block();                          //constructor needed
        }else if(T.toStringTree(parser).contains("RATING")){
            type = TransactionTypes.RATING;
            transBlock = new Rating_Block();                        //constructor needed
        }else if(T.toStringTree(parser).contains("EXPENSE")){
            type = TransactionTypes.EXPENSE;
            transBlock = new Expense_Block();                       //constructor needed
        }else if(T.toStringTree(parser).contains("CALL")){
            type = TransactionTypes.CALL;
            transBlock = new Call_Block();                          //constructor needed
        }else if(T.toStringTree(parser).contains("DEFINE")){
            System.out.println("IN HERE");
            type = TransactionTypes.DEFINE;
            transBlock = new Define_Block(QueryString,callerAccount);                        //constructor needed
        }else if (T.toStringTree(parser).contains("BID")){
            type = TransactionTypes.BID;
            transBlock = new Bid_Block();                           //constructor needed
        }else{
            type = TransactionTypes.LOCATE;
            transBlock = new Locate_Block();                       //constructor needed
        }



        //upon creation of a donation/call/project/bid/expense --> create the appropriate freelist blocks
        //System.out.println(T.toString(parser));
        //System.out.println(T.toStringTree(parser));
        //RuleContext child = (RuleContext)T.getChild(0).getPayload();
        //TreeRecursion(child,parser);
        //System.out.println(child.toString(parser));
        //child = (RuleContext)child.getChild(0).getPayload();
        //System.out.println(child.toString(parser));
    }


    private void TreeRecursion(RuleContext T, fullQParser parser){
        //System.out.println(T.toString(parser));
    }

    public void setStatusComplete(boolean complete){
        statusComplete = complete;
    }

    @Override
    public String toString(){
        String s="";
        s+="\ntype: "+type;
        s+="\nstatus: "+statusComplete;
        s+="\ncaller: "+callerAccount;

        return s;
    }
}
