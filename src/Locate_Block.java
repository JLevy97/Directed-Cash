/**
 * Created by User on 10/12/2018.
 */
public class Locate_Block extends Transaction_Block_proto {

    String Category;
    String findName;

    public Locate_Block(String Qtree,Account_proto own){

        super(own.username, TransactionTypes.DONTATE);

        System.out.println(Qtree);

        int loc = Qtree.indexOf("LOCATE");
        String definition  = Qtree.substring(loc);
        String[] elements = definition.split(" ");

        System.out.println(definition);

        Category = elements[1];
        findName = elements[2];


        if (Qtree.contains("WHERE")){
            //process for parsing conditions
        }
    }

    public String toString(){
        String s="";
        s+="\ntype: "+type;
        s+="\nname: "+name;
        s+="\n:category "+Category;
        s+="\nfind name: "+ findName;

        return s;
    }


}
