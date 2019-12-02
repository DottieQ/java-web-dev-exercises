package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class BankAccount {

    // Bank Account has a balance
    // Bank Account has an account number
    // who owns the variable

    protected double balance;
    private int accountNo;
    private static int nextAccountNumber = 800;

    // constructors job is to make sure each variable has a value.
    public BankAccount(double balance) {
        this.balance = balance;
        this.accountNo = nextAccountNumber;
        this.nextAccountNumber++;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAccountNo() {
        return this.accountNo;
    }

    public boolean withdrawal(double amount) {
        if (amount < this.balance && amount > 0) {
            this.balance = this.balance - amount;
            return true;
        }
        return false;
    }

    public boolean deposit(double amount) {
        if (amount < 0) {
            this.balance = this.balance + amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", accountNo=" + accountNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return accountNo == that.accountNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNo);
    }

    public static void main(String[] args) {
        BankAccount dougsAccount = new BankAccount(1000); // this is calling the constructor

        System.out.println(dougsAccount); //toString prints this automatically

        System.out.println(dougsAccount.withdrawal(500));

        System.out.println(dougsAccount);

        BankAccount jennysAccount = dougsAccount;
        //new variable that points at the same object - second sign pointing to same object
        jennysAccount.withdrawal(50);
        System.out.println(dougsAccount);
        System.out.println(jennysAccount == dougsAccount); //this will be true
    }
}




