/**
 * Created by User on 6/20/2018.
 */
public class Matching {

    //variable to connect to chain

    public Block_proto SweepMatch(Block_proto toMatch, Ledger_proto ledger){

        return null;
    }

    //does a general brute force match to catch some leftover matches. //BRUTE FORCE, NOT EFFICIENT, N^2
    public void GeneralSweepMatching(Ledger_proto ledger){

        for (Block_proto b: ledger.chain){
            if (b.matched) SweepMatch(b,ledger);
        }

    }

}
