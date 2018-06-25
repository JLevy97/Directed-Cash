import java.util.List;

/**
 * Created by User on 6/22/2018.
 */
public class Account_Aggregator extends Account_proto {

    double totalPoints;
    double totalRatings;
    double ratingScore;
    List<Project> projectList;


    public void addRating(double rate, double outOf){
        if (rate<=outOf){
            totalPoints+=(rate/outOf);
            totalRatings+=1;
            ratingScore = totalPoints/totalRatings; //scale from 0-1
        }else{
            System.out.println("invalid rating");
        }
    }

    public double removeIncomeFromProject(String name){

        for (Project p : projectList){
            if(p.name == name){
                return p.removeFunds();
            }
        }

        return -1;
    }


}
