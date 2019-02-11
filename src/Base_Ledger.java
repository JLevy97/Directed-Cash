import java.util.ArrayList;
import java.util.List;

//ledger with nothing fancy. Just a main log, and minimal separations for the ease of the DAG interpreter's Validity case.
public class Base_Ledger {

    List<Transaction_proto> chain;
    List<Project> allProjects;
    List<Call_Block> allCalls;
    List<Transaction_Block_proto> allbids;

    public Base_Ledger(){
        chain = new ArrayList<>();
        allProjects = new ArrayList<>();
        allbids = new ArrayList<>();
        allCalls = new ArrayList<>();
    }


}
