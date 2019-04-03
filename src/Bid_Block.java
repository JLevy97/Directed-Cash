/**
 * Created by User on 10/11/2018.
 */
public class Bid_Block extends Transaction_Block_proto {

    String currency;
    String to;
    Double amount;

    public Bid_Block(String Qtree,Account_proto own){

        int loc = Qtree.indexOf("BID");
        String definition  = Qtree.substring(loc);
        String[] elements = definition.split(" ");

        System.out.println(definition);

        currency = elements[1];
        amount = Double.parseDouble(elements[2]);
        to = elements[4];
        name = elements[7].substring(0,elements[7].indexOf(")"));

        if (Qtree.contains("WHERE")){
            //process for parsing conditions
        }

    }

    public String toString(){
        String s="";
        s+="\ntype: "+type;
        s+="\nname: "+name;
        s+="\n:amount "+amount;
        s+="\ncurency: "+ currency;
        s+="\nto: "+ to;

        return s;
    }

}
