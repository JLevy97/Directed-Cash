import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by User on 6/20/2018.
 */
public class Ledger_proto {

    //using a freelist and Malloc idea for the organization of the ledger

    List<Block_proto> chain;
    List<Account_proto> possibleUsers;
    Map<Block_proto,List<Block_proto>> donationMactches;
    Map<Block_proto,Block_proto> BidMactches;
    Map<Block_proto,Block_proto> ExpenseMactches;

    public Ledger_proto(List<Block_proto> chain) {
        this.chain = chain;
    }

    public Ledger_proto(){
        chain = new ArrayList<>();
    }

    public void AddUser(Account_proto account){
        possibleUsers.add(account);
    }

    public void AddToBlockChain(Block_proto block){
        chain.add(block);
    }

    //other elements to blocks??

}
