package com.set;


public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        double availableBalance = getBalance() + overdraftLimit;
        if (amount <= availableBalance) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal limit exceeded.");
        }
    }
}
