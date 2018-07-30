import java.util.List;

/**
 * Created by User on 7/18/2018.
 */
public class Donation_Block_proto extends Transaction_Block_proto {

    List<Conditions> integrityConstraints;
    boolean matched;                //matches transaction if the transaction is not a direct query
    double donationAmount;
}
