import org.antlr.runtime.tree.ParseTree;

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
    public Transaction_proto(ParseTree T){


        //upon creation of a donation/call/project/bid/expense --> create the appropriate freelist blocks
    }

}
