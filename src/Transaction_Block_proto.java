import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by User on 7/16/2018.
 */
public class Transaction_Block_proto implements Serializable{

    String name;
    TransactionTypes type;
    ArrayList<Condition> conditions;
    boolean matched;                //matches transaction if the transaction is not a direct query

    public Transaction_Block_proto() {
    }

    public Transaction_Block_proto(String name, TransactionTypes type) {
        this.name = name;
        this.type = type;
        this.conditions = new ArrayList<>();
        this.matched = false;
    }
}
