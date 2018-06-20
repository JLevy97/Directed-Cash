/**
 * Created by User on 6/18/2018.
 */
public class PseudoBank {

    public Token_Proto toTocken(String curr, int amount){
        Token_Proto t = new Token_Proto(curr, amount);
        return t;
    }

    public int toAmount(Token_Proto t){
        return t.amount;
    }

}
