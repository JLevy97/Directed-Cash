import java.io.Serializable;

//is this still needed????????????????????????????????


/**
 * Created by User on 6/18/2018.
 */
public class Chain_Block_proto implements Serializable{
    Token_Proto token;
    AccountTypes blockType;
    Account_proto acc;

    public Chain_Block_proto(Account_proto acc, Token_Proto token, Transaction_proto transaction, AccountTypes blockType) {
        this.acc = acc;
        this.token = token;
        this.blockType = blockType;
    }

}
