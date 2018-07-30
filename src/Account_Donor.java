/**
 * Created by User on 6/22/2018.
 */
public class Account_Donor extends Account_proto{

    double walletValue;

    public Account_Donor(String username, String password, AccountTypes accountType, double walletValue) {
        super(username, password, accountType);
        this.walletValue = walletValue;
    }

    public void addToWallet(double amount){
        walletValue+=amount;
    }
}
