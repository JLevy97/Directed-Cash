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

    Ledger_proto ledger;
    Transaction_Manager tm;
    List<Transaction_proto> transactions = new ArrayList<>();

    public Consensus_Node(){

    }

    public Ledger_proto run(String Q){


        //String Query = "FROM brightraycharity ID=7 DEFINE PROJECT fooddrive GOAL $10000 WHERE SCHEMA=1 AND CATEGORY=FOOD";
        RuleContext q = AntlrParse.parse(Q);
        queryList.add(q);

        for (int i=0;i<queryList.size();i++){

            RuleContext command = queryList.get(i);

            //if the command is within DAG order, execute
            if (DAGinterpreter.validDAGOrder(ledger,DAG,KeyNames, RuleC, fullP)) {
                //execute command
            }

        }

        return ledger;
    }


}
