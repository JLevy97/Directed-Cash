import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 6/20/2018.
 */
public class Ledger_proto {

    List<Block_proto> chain;

    public Ledger_proto(List<Block_proto> chain) {
        this.chain = chain;
    }

    public Ledger_proto(){
        chain = new ArrayList<>();
    }

    public void AddToBlockChain(Block_proto block){
        chain.add(block);
    }

    //other elements to blocks??

}
