import java.util.List;

/**
 * Created by User on 10/11/2018.
 */
public class Call_Block extends Transaction_Block_proto {

    String category;
    String categoryName;
    String currency;
    double callAmount;
    List<Bid_Block> bids;

    //FROM jimmy ID= 88 CALL PROJECT foodff VENDOR RFP $ 106

    public Call_Block(String Qtree,Account_proto own){

        super(own.username, TransactionTypes.DONTATE);

        System.out.println(Qtree);

        int loc = Qtree.indexOf("CALL");
        String definition  = Qtree.substring(loc);
        String[] elements = definition.split(" ");

        System.out.println(definition);

        currency = elements[5];
        callAmount = Double.parseDouble(elements[6].substring(0,elements[6].indexOf(")")));
        categoryName = elements[2];
        name = categoryName;
        category = elements[1];


        if (Qtree.contains("WHERE")){
            //process for parsing conditions
        }

    }

    public String toString(){
        String s="";
        s+="\ntype: "+type;
        s+="\nname: "+name;
        s+="\n:category "+category;
        s+="\ncategory name:"+categoryName;
        s+="\ncurency: "+ currency;
        s+="\nammount: "+ callAmount;

        return s;
    }

}
