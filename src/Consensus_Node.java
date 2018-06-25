import org.antlr.runtime.tree.ParseTree;

import java.util.List;

/**
 * Created by User on 6/22/2018.
 */
public class Consensus_Node { //possible leader nodes that interact with the ledger

    Ledger_proto blockchain;
    List<ParseTree> queryList;
    //other network and conscensus need variables

    public void run(){

        //accept connections

        //run transaction manager to deal with gathered queries

        //run matching on ledger periodically

        //send pulse to update other nodes

        //repeat until no longer leader

    }

}
