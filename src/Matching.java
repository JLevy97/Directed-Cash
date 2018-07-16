/**
 * Created by User on 6/20/2018.
 */
public class Matching {

    //variable to connect to chain

    /**
     * slow n^2 algorithm to match a Block to another
     *
     * @param toMatch
     * @param ledger
     * @return
     */
    public Chain_Block_proto SweepMatch(Transaction_proto toMatch, Ledger_proto ledger){

        if(toMatch.type == TransactionTypes.DONTATE){
            //sweep through projects for a fit for that donation
        }else if(toMatch.type == TransactionTypes.EXPENSE){
            //sweep through bids for that project
        }else if(toMatch.type == TransactionTypes.BID){
            //sweep through calls that match description of bid
        }else if (toMatch.type == TransactionTypes.CALL){
            //sweep through bids to pick a match
        }else if(toMatch.type == TransactionTypes.PROJECT){
            //sweep through donors to find a match
        }else{
            //not a matching transaction type
        }



        return null;
    }

    //does a general brute force match to catch some leftover matches. //BRUTE FORCE, NOT EFFICIENT, N^2
    public void GeneralSweepMatching(Ledger_proto ledger){

        //sweep through donors
        //sweep through bids
        //sweep through expenses

    }

}
