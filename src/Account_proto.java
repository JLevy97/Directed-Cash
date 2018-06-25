import java.io.Serializable;

/**
 * Created by User on 6/18/2018.
 */
public class Account_proto implements Serializable {

    String username;
    String password;
    AccountTypes accountType;

    public Account_proto() {
        username = null;
        password = null;
        accountType = null;
    }

    public Account_proto(String username, String password, AccountTypes accountType) {
        this.username = username;
        password = password;
        this.accountType = accountType;
    }

    public boolean GoodLogIn(String user, String pass){
        return (user == username) && (pass == password);
    }

}
