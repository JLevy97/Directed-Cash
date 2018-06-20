import java.io.Serializable;

/**
 * Created by User on 6/18/2018.
 */
public class Block_proto implements Serializable{


    Token_Proto token;
    Transaction_proto transaction;
    AccountTypes blockType;
    Account_proto acc;

    public Block_proto(Account_proto acc, Token_Proto token, Transaction_proto transaction, AccountTypes blockType) {
        this.acc = acc;
        this.token = token;
        this.transaction = transaction;
        this.blockType = blockType;
    }

}
