import java.util.List;

/**
 * Created by User on 10/11/2018.
 */
public class Call_Block extends Transaction_Block_proto {

    String category;
    String categoryName;
    String currency;
    double callAmount;
    List<Bid_Block> bids;
    String callName;

}
