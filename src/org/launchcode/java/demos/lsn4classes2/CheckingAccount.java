package org.launchcode.java.demos.lsn4classes2;

public class CheckingAccount extends BankAccount {

    private double fee;

    public CheckingAccount(double balance, double fee) {
        super(balance);
        this.fee = fee;

    }

    // changed balance field in BankAccount to protected, but could use getBalance to keep field private

    public void chargeFee() {
        this.balance = this.balance - this.fee;
    }

}
