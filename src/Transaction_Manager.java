import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.RuleContext;

/**
 * Created by User on 6/20/2018.
 */
public class Transaction_Manager {

    //variables for connections to chain
    Ledger_proto ledger;
    Consensus_Node parent_Node;
    PseudoBank bank;

    public Transaction_Manager(Ledger_proto l){
        ledger = l;
        bank = new PseudoBank();
    }

    public void updateLedger(Ledger_proto l){
        ledger = l;
    }

    public Transaction_proto CreateTransactionFromParse(RuleContext t, fullQParser parser){

        Account_proto test = new Account_proto();
        return new Transaction_proto(t, parser, test);
    }

    //executes the transaction lifespan
    public void runTransaction(Transaction_proto t){

        //enter transaction into the log
        transactionEntering(t);
        Transaction_Block_proto match = null;

        //execute transactions that do not require a Match to proceed
        if (t.type == TransactionTypes.FIND){
            transactionCompletion(t);
        }else if (t.type == TransactionTypes.DEFINE){
            transactionCompletion(t);
        }else if (t.type == TransactionTypes.RATING ){
            transactionCompletion(t);
        }else if (t.type == TransactionTypes.LOCATE ){
            transactionCompletion(t);
        }

        //System.out.println("aaaaaaaa: "+ledger.freeProjects);
        Transaction_Block_proto mat = Matching.SweepMatch(t.transBlock, ledger);
    }


    //enters transaction into the ledger
    public void transactionEntering(Transaction_proto t){
        if (t.type == TransactionTypes.DONTATE){
            ledger.freeDonations.add(t.transBlock);
            ledger.chain.add(t);
        }else if (t.type == TransactionTypes.FIND){
            ledger.chain.add(t);
        }else if (t.type == TransactionTypes.RATING){
            ledger.chain.add(t);
        }else if (t.type == TransactionTypes.EXPENSE){
            ledger.freeExpenses.add(t.transBlock);
            ledger.chain.add(t);
        }else if (t.type == TransactionTypes.CALL){
            ledger.chain.add(t);
        }else if (t.type == TransactionTypes.DEFINE){
            ledger.freeProjects.add(t.transBlock);
            ledger.chain.add(t);
        }else if (t.type == TransactionTypes.BID){
            ledger.freeBids.add(t.transBlock);
            ledger.chain.add(t);
        }else if(t.type == TransactionTypes.LOCATE){
            ledger.chain.add(t);
        } else{
            System.out.println("unsupported action");
        }
    }

    //completes this transaction
    public void transactionCompletion(Transaction_proto t){
        Transaction_Block_proto tBlock = t.transBlock;
        boolean complete = false;

        if (t.type == TransactionTypes.DONTATE){

        }else if (t.type == TransactionTypes.FIND){

        }else if (t.type == TransactionTypes.RATING){

        }else if (t.type == TransactionTypes.EXPENSE){

        }else if (t.type == TransactionTypes.CALL){

        }else if (t.type == TransactionTypes.DEFINE){
            performDefine(tBlock);
        }else if (t.type == TransactionTypes.BID){

        }else if (t.type == TransactionTypes.LOCATE){

        }else{
            complete = false;
        }

        if (!complete){
            System.out.println("transaction failed");
        }else{
            t.statusComplete = true;
        }
    }

    ///////////////////////////////////////////////////////////////////performs each type of transaction

    public Transaction_proto performDonate(Transaction_Block_proto exec){

        if(exec.type == TransactionTypes.BUBBLEUP){

            Match_Block_proto m = (Match_Block_proto)exec;
            //move money from donation into project and update project stats
            Define_Block to = (Define_Block)m.b;
            Donate_Block from = (Donate_Block)m.a;
            Boolean function = bank.Donate(from.amount,to.pr);

            //print that money has been moved into projct and that donation is complete
            System.out.println("Donation: "+from);
            System.out.println("TO: "+to);
            System.out.println("Status: "+function);
        }

        //maybe not return a transaction
        return null;
    }

    public Transaction_proto performFind(Transaction_Block_proto exec){

        //get type of category looked for
        Find_Block f = (Find_Block)exec;
        //search in ledger for match
        for(int i=0;i<ledger.chain.size();i++){
            if(ledger.chain.get(i).name.equals(f.name)){
                //return info as transaction(print for now)
                System.out.println("Transaction: "+ledger.chain.get(i));
            }
        }


        return null;
    }

    public  Transaction_proto performRating(Transaction_Block_proto exec){

        //find aggregate from accuonts
        Rating_Block r = (Rating_Block)exec;
        boolean complete = bank.addRating(r.RateName,r.rating,r.outOf);
        if(complete){
            System.out.println("gave rating: "+(r.rating/r.outOf)+ " to "+ r.RateName);
        }

        return null;
    }

    public static Transaction_proto performExpense(Transaction_Block_proto exec){

        if(exec.type == TransactionTypes.BUBBLEUP){

            Match_Block_proto m = (Match_Block_proto)exec;
            //find call
            Bid_Block bid = (Bid_Block)m.b;
            Expense_Block exp = (Expense_Block)m.a;

            //print that money has been moved into vendor and that expense is complete

        }

        return null;
    }

    public Transaction_proto performCall(Transaction_Block_proto exec){

        //find project
        Call_Block c = (Call_Block)exec;
        //add call
        for (int i = 0;i<ledger.allProjects.size();i++){
            if (ledger.allProjects.get(i).name.equals(c.categoryName)){
                ledger.allProjects.get(i).calls.add(c);
                System.out.println("call added to: "+ledger.allProjects.get(i));
            }
        }
        //give it a call id too

        return null;
    }

    public Transaction_proto performDefine(Transaction_Block_proto exec){

        //state the definition of the project and its block
        System.out.println("Definition created: "+exec);

        return null;
    }

    public static Transaction_proto performBid(Transaction_Block_proto exec){

        if(exec.type == TransactionTypes.BUBBLEUP){

            Match_Block_proto m = (Match_Block_proto)exec;
            //find call
            Call_Block call = (Call_Block)m.b;
            Bid_Block bid = (Bid_Block)m.a;

            //show information for matching call and bid
            System.out.println("matched");

        }

        return null;
    }

    public  Transaction_proto performLocate(Transaction_Block_proto exec){

        //search through ledger chain for a match to the location target
        //get type of category looked for
        Locate_Block f = (Locate_Block)exec;
        //search in ledger for match
        for(int i=0;i<ledger.chain.size();i++){
            if(ledger.chain.get(i).name.equals(f.name)){
                //return info as transaction(print for now)
                System.out.println("Transaction: "+ledger.chain.get(i));
            }
        }
        //print info for that target.

        return null;
    }
}
