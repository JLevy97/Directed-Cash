import java.util.List;

/**
 * Created by User on 7/23/2018.
 */
public class SysManager {

    Consensus_Cluster cluster;
    List<Account_proto> accounts;

    public void addNode(){

    }

    public void addAccount(){

        //grab
        Account_proto create = new Account_proto();
        accounts.add(create);
        cluster.account_protos = accounts;
    }
}
