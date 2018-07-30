import java.io.Serializable;

/**
 * Created by User on 6/18/2018.
 */
public class PseudoBank implements Serializable {

    public Token_Proto toToken(String curr, int amount){
        Token_Proto t = new Token_Proto(curr, amount);
        return t;
    }

    public int toAmount(Token_Proto t){
        return t.amount;
    }


    //authorize a correct transaction or issue statements
    public boolean autorize(){
        return true;
    }

}
