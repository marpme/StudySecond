package account;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Class description ...
 * Included in account
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 16. Dec 2016
 */
public class Account implements IAccount {

    private List<Transaction> transactions = new LinkedList<>();

    private float balance;


    public List<Transaction> getTransactions(){
        return transactions;
    }

    private void changeBalance(float sum){
        balance += sum;
    }


    /**
     * Gets the balance of the account
     *
     * @return the balance of your account
     */
    @Override
    public float getBalance() {
        return balance;
    }

    /**
     * Deposits money from your account
     *
     * @param sum positive value to depose
     * @throws IllegalArgumentException if deposit is negative
     */
    @Override
    public void deposit(float sum) throws IllegalArgumentException {
        if(sum <= 0){
            throw new IllegalArgumentException("Your deposit value is not valid. Deposit canceled.");
        }
        balance += sum;
        this.logTransactions(TransactionType.DEPOSIT, "", sum, this, new Date());
    }

    /**
     * Withdraw money form your bank account
     *
     * @param sum positive value to withdraw
     * @throws IllegalArgumentException if value is negative or if insufficient money
     */
    @Override
    public void withdraw(float sum) throws IllegalArgumentException {
        if(sum <= 0){
            throw new IllegalArgumentException("Your withdraw value isn't valid. Withdraw canceled.");
        }

        balance -= sum;
        this.logTransactions(TransactionType.WITHDRAW, "", sum, this, new Date());

    }

    /**
     * Bank transfer to another account.
     *
     * @param account         the account
     * @param sum             the positive sum
     * @param msg             the message for accounting
     * @param transactionDate the transaction date
     * @throws IllegalArgumentException if invalid date, msg, sum or account
     */
    @Override
    public void transfer(IAccount account, float sum, String msg, Date transactionDate) throws IllegalArgumentException {

        if(account == null){
            throw new IllegalArgumentException("Account to transfer Money to is empty. Transfer canceled.");
        }else if (sum <= 0){
            throw new IllegalArgumentException("Transfer value is invalid. Transfer canceled.");
        }else if(msg == null){
            throw new IllegalArgumentException("You message cannot be null, but empty. Transfer canceled.");
        }else if(transactionDate == null){
            throw new IllegalArgumentException("Transaction date must not be null! Transfer canceled.");
        }

        this.changeBalance(-sum);
        account.receiveTransfer(this, sum, msg, transactionDate);
        this.logTransactions(TransactionType.TRANSFER_SEND, msg, sum, account, new Date());

    }

    /**
     * Receives a transaction from another account and loggs it.
     *
     * @param acc            the account from
     * @param sum             the sum
     * @param msg             the msg
     * @param transactionDate the date
     * @throws IllegalArgumentException if invalid date, msg, sum or account
     */
    public void receiveTransfer(IAccount acc, float sum, String msg, Date transactionDate) throws IllegalArgumentException {
        this.changeBalance(sum);
        logTransactions(TransactionType.TRANSFER_RECEIVE, msg, sum, acc, transactionDate);
    }

    private void logTransactions(TransactionType type, String msg, float sum, IAccount acc, Date date){
        this.transactions.add(new Transaction(type,
                msg, sum, acc, date));
    }

    @Override
    public String toString() {
        return "Account{" +
                " balance=" + balance +
                " } \n";
    }
}
