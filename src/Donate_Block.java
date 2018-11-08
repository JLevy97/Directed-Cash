/**
 * Created by User on 10/11/2018.
 */
public class Donate_Block extends Transaction_Block_proto {

    Account_proto owner;
    String currency;
    Double amount;
    String howOften;
    String start;
    String end;

    public Donate_Block(String Qtree,Account_proto own){

        super(own.username, TransactionTypes.DONTATE);

        System.out.println(Qtree);

        int loc = Qtree.indexOf("DONATE");
        String definition  = Qtree.substring(loc);
        String[] elements = definition.split(" ");

        System.out.println(definition);

        currency = elements[1];
        amount = Double.parseDouble(elements[2]);
        howOften = elements[3];
        start = elements[4];
        end = elements[6];


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
        s+="\nhow often: "+ howOften;

        return s;
    }

}
