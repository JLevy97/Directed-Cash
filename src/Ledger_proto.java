import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by User on 6/20/2018.
 */
public class Ledger_proto {

    //workflow abstraction?????
        //black box sequence & roles
        //workflow specification


    /*using a segmented freelist theory from Malloc where each segment is a type of block to match.
    idea to ease and quicken the matching for specific types of blocks.
    the freelists hold the blocks that can still be matched(free blocks) and the Maps contain the pairs/matches for transactions(allocated blocks)
    The actual chain is kept as a log for all the transactions completed.
     */

    List<Transaction_proto> chain;    //list of transactions done
    List<Transaction_Block_proto> allProjects;
    List<Transaction_Block_proto> allCalls;
    List<Transaction_Block_proto> allbids;


    /// List<Account_proto> possibleUsers;  //list of transactions              ??maybe accounts are kept by the cluster ---> maybe put into bank



    List<Transaction_Block_proto> freeDonations;
    List<Transaction_Block_proto> freeProjects;
    List<Transaction_Block_proto> freeCalls;
    List<Transaction_Block_proto> freeBids;
    List<Transaction_Block_proto> freeExpenses;

    Map<Transaction_Block_proto,List<Transaction_Block_proto>> DonationMactches;   //project block matches to multiple donors
    Map<Transaction_Block_proto,List<Transaction_Block_proto>> BidMactches;        //call matches to multiple bids
    Map<Transaction_Block_proto, Transaction_Block_proto> ExpenseMactches;          //bid matches to one chosen expense

    //constructor
    public Ledger_proto(){

        chain = new ArrayList<>();
        allProjects = new ArrayList<>();
        allbids = new ArrayList<>();
        allCalls = new ArrayList<>();

        freeDonations = new ArrayList<>();
        freeProjects = new ArrayList<>();
        freeCalls = new ArrayList<>();
        freeBids = new ArrayList<>();
        freeExpenses = new ArrayList<>();

        DonationMactches = new HashMap<>();
        BidMactches = new HashMap<>();
        ExpenseMactches = new HashMap<>();
    }

    //other elements to blocks??

}
