package com.set;

public class Account{
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}
