import java.util.List;

/**
 * Created by User on 6/25/2018.
 */
public class Consensus_Cluster {

    List<Consensus_Node> cluster;
    List<Consensus_Node> addToClusterQueue;
    List<Account_proto> account_protos;
    Consensus_Node leader;
    Consensus_Node[] delegates;
    final SysManager sysManager = new SysManager();

    public static void main(String[] args){

    }

    ////////////////////////////////////////////////////////////
    public static void Elections(){

    }


}
