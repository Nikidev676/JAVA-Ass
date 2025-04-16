package com.set.hexa;



public class Account {
    // Private attributes for encapsulation
    private long accountNumber;
    private String accountType;
    private double accountBalance;
    
    // Constant for interest rate
    private static final double INTEREST_RATE = 4.5;
    
    // Default constructor
    public Account(String string, String string2, double d) {
        this.accountNumber = 0;
        this.accountType = "";
        this.accountBalance = 0.0;
    }
    
    // Parameterized constructor
    public Account(long accountNumber, String accountType, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }
    
    // Getter methods
    public long getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountType() {
        return accountType;
    }
    
    public double getAccountBalance() {
        return accountBalance;
    }
    
    // Setter methods
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    
    // Method to deposit money into the account
    public boolean deposit(float amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Amount " + amount + " deposited successfully.");
            System.out.println("New balance: " + accountBalance);
            return true;
        } else {
            System.out.println("Invalid deposit amount. Amount must be positive.");
            return false;
        }
    }
    
    // Method to withdraw money from the account
    public boolean withdraw(float amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Amount must be positive.");
            return false;
        } else if (amount > accountBalance) {
            System.out.println("Insufficient balance. Current balance: " + accountBalance);
            return false;
        } else {
            accountBalance -= amount;
            System.out.println("Amount " + amount + " withdrawn successfully.");
            System.out.println("Remaining balance: " + accountBalance);
            return true;
        }
    }
    
    // Method to calculate interest
    public double calculateInterest() {
        double interestAmount = accountBalance * (INTEREST_RATE / 100);
        System.out.println("Interest calculated at " + INTEREST_RATE + "% rate: " + interestAmount);
        return interestAmount;
    }
    
    // Method to print account information
    public void printAccountInfo() {
        System.out.println("Account Information:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
    }
}