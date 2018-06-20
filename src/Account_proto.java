import java.io.Serializable;

/**
 * Created by User on 6/18/2018.
 */
public class Account_proto implements Serializable {

    String username;
    String password;
    AccountTypes accountType;
    double totalPoints;
    double totalRatings;
    double ratingScore;

    public Account_proto(String username, String password, AccountTypes accountType) {
        this.username = username;
        password = password;
        this.accountType = accountType;
        totalPoints =0;
        totalRatings =0;
        ratingScore =0;
    }

    public boolean GoodLogIn(String user, String pass){
        return (user == username) && (pass == password);
    }


    public void addRating(double rate, double outOf){
        if (rate<=outOf){
            totalPoints+=(rate/outOf);
            totalRatings+=1;
            ratingScore = totalPoints/totalRatings; //scale from 0-1
        }else{
            System.out.println("invalid rating");
        }

    }
}
