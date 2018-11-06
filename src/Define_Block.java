/**
 * Created by User on 10/11/2018.
 */
public class Define_Block extends Transaction_Block_proto {

    Account_proto owner;
    String Category;
    String name;
    String currency;
    double goal;
    Project_Block_proto project;
    Project pr;

    public Define_Block(){

    }

    public Define_Block(String Qtree,Account_proto own){
        System.out.println(Qtree);

        owner = own;


        project = new Project_Block_proto();
        //pr = new Project();
    }
}
