import org.antlr.runtime.tree.ParseTree;

/**
 * Created by User on 6/20/2018.
 */
public class Transaction_Manager {

    //variables for connections to chain
    Ledger_proto ledger;

    public Transaction_Manager(Ledger_proto l){
        ledger = l;
    }

    public void updateLedger(Ledger_proto l){
        ledger = l;
    }

    public Transaction_proto CreateTransactionFromParse(ParseTree t){

        return new Transaction_proto(t);
    }

    //executes the transaction lifespan
    public void runTransaction(Transaction_proto t){

        transactionEntering(t);
        transactionCompletion(t);

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
            ledger.freeDonations.add(t.transBlock);
            ledger.chain.add(t);
        }else if (t.type == TransactionTypes.CALL){
            ledger.chain.add(t);
        }else if (t.type == TransactionTypes.DEFINE){
            ledger.chain.add(t);
        }else if (t.type == TransactionTypes.BID){
            ledger.freeDonations.add(t.transBlock);
            ledger.chain.add(t);
        }else{
            System.out.println("unsupported action");
        }
    }

    //completes this transaction
    public void transactionCompletion(Transaction_proto t){
        boolean complete = false;
        Transaction_proto bubbleUp = null;

        if (t.type == TransactionTypes.DONTATE){
            if(t.matched) bubbleUp=performDonate();
            if (bubbleUp!=null){
                transactionCompletion(bubbleUp);
            }else {
                complete = true;
            }
        }else if (t.type == TransactionTypes.FIND){
            bubbleUp = performFind();
            if (bubbleUp!=null){
                transactionCompletion(bubbleUp);
            }else {
                complete = true;
            }
        }else if (t.type == TransactionTypes.RATING){
            bubbleUp = performRating();
            if (bubbleUp!=null){
                transactionCompletion(bubbleUp);
            }else {
                complete = true;
            }
        }else if (t.type == TransactionTypes.EXPENSE){
            if(t.matched) bubbleUp=performExpense();
            if (bubbleUp!=null){
                transactionCompletion(bubbleUp);
            }else {
                complete = true;
            }
        }else if (t.type == TransactionTypes.CALL){
            bubbleUp=performCall();
            if (bubbleUp!=null){
                transactionCompletion(bubbleUp);
            }else {
                complete = true;
            }
        }else if (t.type == TransactionTypes.DEFINE){
            bubbleUp=performDifine();
            if (bubbleUp!=null){
                transactionCompletion(bubbleUp);
            }else {
                complete = true;
            }
        }else if (t.type == TransactionTypes.BID){
            if(t.matched) bubbleUp=performBid();
            if (bubbleUp!=null){
                transactionCompletion(bubbleUp);
            }else {
                complete = true;
            }
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

    public Transaction_proto performDonate(){

        return null;
    }

    public Transaction_proto performFind(){

        return null;
    }

    public Transaction_proto performRating(){

        return null;
    }

    public Transaction_proto performExpense(){

        return null;
    }

    public Transaction_proto performCall(){

        return null;
    }

    public Transaction_proto performDifine(){

        return null;
    }

    public Transaction_proto performBid(){

        return null;
    }


}
