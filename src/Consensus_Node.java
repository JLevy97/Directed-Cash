import org.antlr.v4.runtime.RuleContext;
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
    List<RuleContext> queryList;

    Transaction_Manager tm;
    List<Transaction_proto> transactions = new ArrayList<>();

    //other network and conscensus need variables

    public void run(){

        //accept connections

        //run transaction manager to deal with gathered queries

        //Query = connection.getQuery();
        String Query = "FROM brightraycharity ID=7 DEFINE PROJECT fooddrive GOAL $10000 WHERE SCHEMA=1 AND CATEGORY=FOOD";
        RuleContext q = AntlrParse.parse(Query);
        queryList.add(q);

       // Transaction_proto trans = tm.CreateTransactionFromParse(q);
        //transactions.add(trans);
        //tm.runTransaction(trans);

        //run matching on ledger periodically

        //send pulse to update other nodes

        //repeat until no longer leader

    }

}
