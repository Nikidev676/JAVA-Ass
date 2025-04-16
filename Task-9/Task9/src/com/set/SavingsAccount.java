package com.set;


public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String customerName, double balance, double interestRate) {
        super(accountNumber, customerName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit successful. New balance: " + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        double newBalance = getBalance() - amount;
        if (newBalance >= 0) {
            setBalance(newBalance);
            System.out.println("Withdrawal successful. New balance: " + getBalance());
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        setBalance(getBalance() + interest);
        System.out.println("Interest calculated. New balance: " + getBalance());
    }
}
