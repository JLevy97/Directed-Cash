/**
 * Created by User on 6/20/2018.
 */
public class Transaction_Manager {

    //variables for connections to chain

    //completes this transaction
    public void transactionCompletion(Transaction_proto t){
        boolean complete = false;
        if (t.type == TransactionTypes.DONTATE){
            if(t.matched) complete=performDonate();
        }else if (t.type == TransactionTypes.FIND){
            complete = performFind();
        }else if (t.type == TransactionTypes.RATING){
            complete = performRating();
        }else if (t.type == TransactionTypes.EXPENSE){
            if(t.matched) complete=performExpense();
        }else if (t.type == TransactionTypes.CALL){
            if(t.matched) complete=performCall();
        }else if (t.type == TransactionTypes.DEFINE){
            complete=performDifine();
        }else if (t.type == TransactionTypes.BID){
            if(t.matched) complete=performBid();
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

    public boolean performDonate(){

        return false;
    }

    public boolean performFind(){

        return false;
    }

    public boolean performRating(){

        return false;
    }

    public boolean performExpense(){

        return false;
    }

    public boolean performCall(){

        return false;
    }

    public boolean performDifine(){

        return false;
    }

    public boolean performBid(){

        return false;
    }


}
