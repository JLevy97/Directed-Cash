import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 6/20/2018.
 */
public class Matching {

    //variable to connect to chain???????/ make it static and pass in ledger?

    /**
     * slow n^2 algorithm to match a Block to another
     *
     * @param toMatch
     * @param ledger
     * @return
     */
    public static void SweepMatch(Transaction_Block_proto toMatch, Ledger_proto ledger){

        if(toMatch.type == TransactionTypes.DONTATE){

            Transaction_Block_proto possibleProj= null;

            //sweep through projects for a fit for that donation
            for(Transaction_Block_proto proj: ledger.freeProjects){
                Project_Block_proto p = (Project_Block_proto)proj;
                //check to make sure the constraints are valid

                    //check if donation goal is already achieved
                    //add to possibleProj
                    //else -> create match block update ledger
                    if (p.project.filled){
                        possibleProj = proj; //is a possible match but not optimal cause it is filled
                    }else{
                        possibleProj = proj;
                        break; //break out so that this becomes the real match
                    }
            }
            if (possibleProj!=null){
                //matching: update matches or insert new
                if (ledger.DonationMactches.containsKey(possibleProj)){
                    List replace = ledger.DonationMactches.get(possibleProj);
                    replace.add(toMatch);
                    ledger.DonationMactches.replace(possibleProj,replace);
                }else{
                    List toAdd = new ArrayList<Transaction_Block_proto>();
                    toAdd.add(toMatch);
                    ledger.DonationMactches.put(possibleProj,toAdd);
                }
                //create matching block
                toMatch.matched = true;
                possibleProj.matched = true;
                Transaction_Block_proto match = new Match_Block_proto(toMatch,possibleProj);
                Transaction_Manager.performDonate(match);
               /* Transaction_proto m = new Transaction_proto();
                m.transBlock = match;
                ledger.chain.add(m);*/
            }

        }else if(toMatch.type == TransactionTypes.EXPENSE){
            //sweep through bids for that project

            Transaction_Block_proto possibleBid= null;

            //sweep through projects for a fit for that donation
            for(Transaction_Block_proto bid: ledger.freeBids){
                Bid_Block b = (Bid_Block)bid;
                //check to make sure the constraints are valid

                //check if donation goal is already achieved
                //add to possibleProj
                //else -> create match block update ledger
                if (!b.matched){
                    possibleBid = bid; //is a possible match but not optimal cause it is filled
                }
            }
            if (possibleBid!=null){
                //matching: update matches or insert new
                if (ledger.ExpenseMactches.containsKey(possibleBid)){
                    List replace = ledger.DonationMactches.get(possibleBid);
                    replace.add(toMatch);
                    ledger.DonationMactches.replace(possibleBid,replace);
                }else{
                    List toAdd = new ArrayList<Transaction_Block_proto>();
                    toAdd.add(toMatch);
                    ledger.DonationMactches.put(possibleBid,toAdd);
                }
                //create matching block
                toMatch.matched = true;
                possibleBid.matched = true;
                Transaction_Block_proto match = new Match_Block_proto(toMatch,possibleBid);
                Transaction_Manager.performExpense(match);
                //Transaction_proto m = new Transaction_proto();
                //m.transBlock = match;
                //ledger.chain.add(m);
            }

        }else if(toMatch.type == TransactionTypes.BID){
            //sweep through calls that match description of bid
            Transaction_Block_proto possibleCall= null;

            //sweep through projects for a fit for that donation
            for(Transaction_Block_proto call: ledger.freeCalls){
                Call_Block c = (Call_Block)call;
                //check to make sure the constraints are valid

                //check if donation goal is already achieved
                //add to possibleProj
                //else -> create match block update ledger
                if (c.matched){
                    possibleCall = call; //is a possible match but not optimal cause it is filled
                }else{
                    possibleCall = call;
                    break; //break out so that this becomes the real match
                }
            }
            if (possibleCall!=null){
                //matching: update matches or insert new
                if (ledger.DonationMactches.containsKey(possibleCall)){
                    List replace = ledger.DonationMactches.get(possibleCall);
                    replace.add(toMatch);
                    ledger.DonationMactches.replace(possibleCall,replace);
                }else{
                    List toAdd = new ArrayList<Transaction_Block_proto>();
                    toAdd.add(toMatch);
                    ledger.DonationMactches.put(possibleCall,toAdd);
                }
                //create matching block
                toMatch.matched = true;
                possibleCall.matched = true;
                Transaction_Block_proto match = new Match_Block_proto(toMatch,possibleCall);
                Transaction_Manager.performBid(match);
             /*   Transaction_proto m = new Transaction_proto();
                m.transBlock = match;
                ledger.chain.add(m);  */
            }

        }else if (toMatch.type == TransactionTypes.CALL){
            //sweep through bids to pick a match
        }else if(toMatch.type == TransactionTypes.PROJECT){
            //sweep through donors to find a match
        }else{
            //not a matching transaction type
            System.out.println("should not be matching");
        }


    }

    //does a general brute force match to catch some leftover matches. //BRUTE FORCE, NOT EFFICIENT, N^2
    public static void GeneralSweepMatching(Ledger_proto ledger){

        //sweep through donors
        for (Transaction_Block_proto x:ledger.freeDonations){
            SweepMatch(x,ledger);
        }
        //sweep through bids
        for(Transaction_Block_proto x:ledger.freeBids){
            SweepMatch(x,ledger);
        }
        //sweep through expenses
        for (Transaction_Block_proto x:ledger.freeExpenses){
            SweepMatch(x,ledger);
        }

    }

}
