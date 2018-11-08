import java.util.Currency;
import java.util.List;

/**
 * Created by User on 10/11/2018.
 */
public class Define_Block extends Transaction_Block_proto {

    Account_proto owner;
    String Category;
    String currency;
    double goal;
    //Project_Block_proto project;
    Project pr;

    public Define_Block(){

    }

    public Define_Block(String Qtree,Account_proto own){

        super(own.username,TransactionTypes.DEFINE);

        System.out.println(Qtree);
        owner = own;

        int loc = Qtree.indexOf("DEFINE");
        String definition  = Qtree.substring(loc);
        definition = definition.substring(0,definition.indexOf(")"));
        String[] elements = definition.split(" ");

        System.out.println(definition);
        if (elements[1].equals("PROJECT")){

            name = elements[2];
            Category = "project";
            currency = elements[4];
            goal = Double.parseDouble(elements[5]);
            pr = new Project(name,goal,0.0,owner);
        }else{
            System.out.println("not supported definition");
        }

        if (Qtree.contains("WHERE")){
            //process for parsing conditions
        }


    }


    public String toString(){
        String s="";
        s+="\ntype: "+type;
        s+="\nname: "+name;
        s+="\ncategory: "+Category;
        s+="\ncurency: "+ currency;
        s+="\ngoal: "+ goal;

        return s;
    }
}
