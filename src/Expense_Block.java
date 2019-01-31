/**
 * Created by User on 10/11/2018.
 */
public class Expense_Block extends Transaction_Block_proto {

    String venderName;
    String currency;
    double expenseAmount;

    //FROM jimmy ID= 88 EXPENSE $ 40 TO VENDOR kenny

    public Expense_Block(String Qtree,Account_proto own){

        super(own.username, TransactionTypes.DONTATE);

        System.out.println(Qtree);

        int loc = Qtree.indexOf("DONATE");
        String definition  = Qtree.substring(loc);
        String[] elements = definition.split(" ");

        System.out.println(definition);

        currency = elements[1];
        expenseAmount = Double.parseDouble(elements[2]);
        venderName = elements[5];

        if (Qtree.contains("WHERE")){
            //process for parsing conditions
        }

    }

    public String toString(){
        String s="";
        s+="\ntype: "+type;
        s+="\nname: "+name;
        s+="\n:amount "+expenseAmount;
        s+="\ncurency: "+ currency;
        s+="\nto vendor: "+ venderName;

        return s;
    }

}
