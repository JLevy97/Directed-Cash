import java.util.List;

/**
 * Created by User on 6/22/2018.
 */
public class Project {  //a goal to donate towards

    String name;
    Double goal;
    Double currentFunds;
    boolean filled;
    Account_proto owner;
    List<Call_Block> calls;

    public Project(String name, Double goal, Double currentFunds, Account_proto owner) {
        this.name = name;
        this.goal = goal;
        this.currentFunds = currentFunds;
        this.filled = false;
        this.owner = owner;
    }

    public void addFunds(double add){
        currentFunds+=add;
        if(currentFunds>goal)filled = true;
    }

    public double removeFunds(){
        double temp = currentFunds;
        currentFunds = 0.0;
        filled = false;
        return temp;
    }


}
