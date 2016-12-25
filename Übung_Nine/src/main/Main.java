package main;

import account.Account;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(2000);

        Account b = new Account();
        b.deposit(333);

        a.transfer(b, 150, "Birthday", new Date());
        b.withdraw(150);

        System.out.println(a.getTransactions());
        System.out.println(b.getTransactions());
    }
}
