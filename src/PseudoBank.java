import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by User on 6/18/2018.
 */
public class PseudoBank implements Serializable {

    ArrayList<Account_proto> userAccounts;

    public PseudoBank(){
        userAccounts = new ArrayList<>();
    }


    public static Token_Proto toToken(String curr, int amount){
        Token_Proto t = new Token_Proto(curr, amount);
        return t;
    }

    public static int toAmount(Token_Proto t){
        return t.amount;
    }


    //authorize a correct transaction or issue statements
    public boolean autorize(Transaction_Block_proto block){



        return true;
    }

}
