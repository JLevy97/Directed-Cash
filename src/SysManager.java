import java.util.List;

/**
 * Created by User on 7/23/2018.
 */
public class SysManager extends Account_proto{

    Consensus_Cluster parent;

    public SysManager(){
        super("SysMan", "pass", AccountTypes.SYSMAN);
    }

    public void addNode(){

        //authorization checks;
        parent.addToClusterQueue.add(new Consensus_Node());
    }

    public void addAccount(){

        //grab
        Account_proto create = new Account_proto();
        parent.account_protos.add(create);
    }

}
