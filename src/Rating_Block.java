/**
 * Created by User on 10/11/2018.
 */
public class Rating_Block extends Transaction_Block_proto {

    String RateName;
    double rating;
    double outOf;

    public Rating_Block(String Qtree,Account_proto own){

        super(own.username, TransactionTypes.FIND);

        System.out.println(Qtree);

        int loc = Qtree.indexOf("RATE");
        String definition  = Qtree.substring(loc);
        String[] elements = definition.split(" ");

        RateName = elements[1];
        rating = Double.parseDouble(elements[3]);
        outOf = Double.parseDouble(elements[5]);

        System.out.println(definition);


        if (Qtree.contains("WHERE")){
            //process for parsing conditions
        }
    }

    public String toString(){
        String s="";
        s+="\ntype: "+type;
        s+="\nname: "+name;
        s+="\n:rate name "+RateName;
        s+="\nrating: "+ rating;
        s+="\nout of: "+ outOf;

        return s;
    }

}
