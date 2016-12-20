package account;

/**
 * Class description ...
 * Included in account
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 16. Dec 2016
 */
public enum TransactionType {

    WITHDRAW  (3),
    DEPOSIT (2),
    TRANSFER_RECEIVE   (1),
    TRANSFER_SEND (0);


    private final int TransactionType;

    private TransactionType(int levelCode) {
        this.TransactionType = levelCode;
    }
}
