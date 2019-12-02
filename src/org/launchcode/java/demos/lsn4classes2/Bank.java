package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Bank {

    private ArrayList<BankAccount> accounts;

    public Bank() {
        accounts = new ArrayList<>();

    }

    public void addSavingsAccount(double balance) {
        SavingsAccount account = new SavingsAccount(balance, 0.01);
        accounts.add(account);
    }


    public void addCheckingAccount(double balance) {

    }
}
