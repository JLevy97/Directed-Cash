import java.util.ArrayList;

/**
 * Created by User on 6/18/2018.
 */
public class Account_proto {

    String username;
    String password;
    Types accountType;

    public Account_proto(String username, String password, Types accountType) {
        this.username = username;
        password = password;
        this.accountType = accountType;
    }

    public boolean goodLogIn(String user, String pass){
        return (user == username) && (pass == password);
    }
}
