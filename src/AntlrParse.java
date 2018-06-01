public class AntlrParse {

    public static void main(String[] args){

        for (int i=0;i<20;i++) {
            System.out.println(CreateQ());
        }
    }


    public static String CreateQ(){

        String q = "";
        int rand = (int)(Math.random()*3)+1;
        if (rand == 1){
            q = createDonorQ();
        }else if (rand == 2){
            q = createAggregatorQ();
        }else{
            q = createVendorQ();
        }


        return q;
    }

    public static String createDonorQ(){

        String DQ = "dq";
        int type = (int)(Math.random()*3)+1;


        return DQ;
    }

    public static String createAggregatorQ(){

        String AQ = "aq";
        int type = (int)(Math.random()*3)+1;

        return AQ;
    }

    public static String createVendorQ(){

        String VQ = "vq";

        return VQ;
    }

}
