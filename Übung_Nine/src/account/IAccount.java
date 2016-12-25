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
public interface IAccount {

    /**
     * Gets the balance of the account
     * @return
     */
    float getBalance();

    /**
     * Deposits money from your account
     * @param sum positive value to depose
     * @throws IllegalArgumentException if deposit is negative
     */
    void deposit(float sum) throws IllegalArgumentException;

    /**
     * Withdraw money form your bank account
     * @param sum positive value to withdraw
     * @throws IllegalArgumentException if value is negative or if insufficient money
     */
    void withdraw(float sum) throws IllegalArgumentException;

    /**
     * Bank transfer to another account.
     * @param account the account
     * @param sum the positive sum
     * @param msg the message for accounting
     * @param transactionDate the transaction date
     * @throws IllegalArgumentException if invalid date, msg, sum or account
     */
    void transfer(IAccount account, float sum, String msg, Date transactionDate) throws IllegalArgumentException;

    /**
     * Receives a transaction from another account and loggs it.
     * @param from the account from
     * @param sum the sum
     * @param msg the msg
     * @param transactionDate the date
     * @throws IllegalArgumentException if invalid date, msg, sum or account
     */
    void receiveTransfer(IAccount from, float sum, String msg, Date transactionDate) throws IllegalArgumentException;
}
