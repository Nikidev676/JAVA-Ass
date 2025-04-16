package com.set;


public class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = -1000;

    public CurrentAccount(String accountNumber, String customerName, double balance) {
        super(accountNumber, customerName, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit successful. New balance: " + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        double newBalance = getBalance() - amount;
        if (newBalance >= OVERDRAFT_LIMIT) {
            setBalance(newBalance);
            System.out.println("Withdrawal successful. New balance: " + getBalance());
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    @Override
    public void calculateInterest() {
        System.out.println("No interest for Current Account.");
    }
}
