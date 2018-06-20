import java.util.List;

/**
 * Created by User on 6/20/2018.
 */
public class Transaction_proto {

    TransactionTypes type;
    Boolean statusComplete;
    List<Conditions> integrityConstraints;
    Account_proto callerAccount;
    boolean matched;                //matches transaction if the transaction is not a direct query
    Account_proto ReceiverAccount;  //

    //gen constructors here


}
