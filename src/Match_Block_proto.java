/**
 * Created by User on 7/18/2018.
 */
public class Match_Block_proto extends Transaction_Block_proto {

    Transaction_Block_proto a;
    Transaction_Block_proto b;

   public Match_Block_proto(Transaction_Block_proto from, Transaction_Block_proto to){
       super.type=TransactionTypes.BUBBLEUP;
       a = from;
       b = to;
   }

}
