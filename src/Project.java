/**
 * Created by User on 6/22/2018.
 */
public class Project {  //a goal to donate towards

    String name;
    Double goal;
    Double currentFunds;
    boolean filled;


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
