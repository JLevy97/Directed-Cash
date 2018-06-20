/**
 * Created by User on 6/18/2018.
 */
public class Token_Proto {

    private static int serial = 0;
    String currency;
    int amount;

    public Token_Proto(String c, int a){
        serial = serial+1;
        currency = c;
        amount = a;
    }

}
