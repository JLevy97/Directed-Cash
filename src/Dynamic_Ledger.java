import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dynamic_Ledger {

    ArrayList<Transaction_proto> BigList;
    ArrayList<ArrayList<Transaction_proto>> dependenciesList;
    ArrayList<Map<Transaction_Block_proto,List<Transaction_Block_proto>>> matchList;

    //gotta figure out a way to dynamically create the map matches
    Map<Transaction_Block_proto,List<Transaction_Block_proto>> DonationMactches;   //project block matches to multiple donors
    Map<Transaction_Block_proto,List<Transaction_Block_proto>> BidMactches;        //call matches to multiple bids
    Map<Transaction_Block_proto, Transaction_Block_proto> ExpenseMactches;

    public Dynamic_Ledger(int[][] DAG,String[] KeyNames,Map<String,String> matches){

        BigList = new ArrayList<>();
        dependenciesList = new ArrayList<ArrayList<Transaction_proto>>();
        for (int i =0;i<KeyNames.length;i++){
            dependenciesList.add(new ArrayList<Transaction_proto>());
        }

        //create a new map for every match pair
        matchList = new ArrayList<Map<Transaction_Block_proto,List<Transaction_Block_proto>>>();
        for (int i =0;i<matches.keySet().size();i++){
            matchList.add(new HashMap<Transaction_Block_proto,List<Transaction_Block_proto>>());
        }

    }



}
