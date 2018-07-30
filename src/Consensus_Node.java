import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 6/22/2018.
 */
public class Consensus_Node { //possible leader nodes that interact with the ledger

    static int Serial;

    boolean isLeader;
    Consensus_Node[] delegate_nodes;
    //find way to measure heartbeat??? or lifeline

    Ledger_proto blockchain;
    List<ParseTree> queryList;

    Transaction_Manager tm;
    List<Transaction_proto> transactions = new ArrayList<>();

    //other network and conscensus need variables

    public void run(){

        //accept connections

        //run transaction manager to deal with gathered queries
        String Query = "gathered from networking";
        queryList.add(AntlrParse.parse(Query));

        //run matching on ledger periodically

        //send pulse to update other nodes

        //repeat until no longer leader

    }

}
