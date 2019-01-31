/**
 * Created by User on 10/11/2018.
 */
public class Find_Block extends Transaction_Block_proto{

    String category;

    public Find_Block(String Qtree,Account_proto own){

        super(own.username, TransactionTypes.FIND);

        System.out.println(Qtree);

        int loc = Qtree.indexOf("FIND");
        String definition  = Qtree.substring(loc);
        String[] elements = definition.split(" ");

        category = elements[1];

        System.out.println(definition);


        if (Qtree.contains("WHERE")){
            //process for parsing conditions
        }

    }

    public String toString(){
        String s="";
        s+="\ntype: "+type;
        s+="\nname: "+name;
        s+="\n:category "+category;

        return s;
    }

}
