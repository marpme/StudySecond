package account;

import java.util.Date;

/**
 * Class description ...
 * Included in account
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 16. Dec 2016
 */
public class Transaction {

    private TransactionType type;

    @Override
    public String toString() {
        if(type == TransactionType.TRANSFER_RECEIVE || type == TransactionType.DEPOSIT){
            return "Transaction{" +
                    "type=" + type +
                    ", message='" + message + '\'' +
                    ", value=" + sum +
                    ", otherAccount=" + otherAccount +
                    ", transactionDate=" + transactionDate +
                    "} \n";
        }
        else{
            return "Transaction{" +
                    "type=" + type +
                    ", message='" + message + '\'' +
                    ", value=" + -sum +
                    ", otherAccount=" + otherAccount +
                    ", transactionDate=" + transactionDate +
                    "} \n";
        }

    }

    private String message;

    private float sum;

    private IAccount otherAccount;

    private Date transactionDate;

    public Transaction(TransactionType type, String message, float sum, IAccount account_to, Date transactionDate) {
        this.type = type;
        this.message = message;
        this.sum = sum;
        this.otherAccount = account_to;
        this.transactionDate = transactionDate;
    }
}
