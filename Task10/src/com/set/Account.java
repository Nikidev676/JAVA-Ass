package com.set;

public class Account {
    private static long nextAccountNumber = 1001;

    private long accountNumber;
    private String accountType;
    private float accountBalance;
    private Customer customer;

    public Account(Customer customer, String accountType, float balance) {
        this.accountNumber = generateAccountNumber();
        this.customer = customer;
        this.accountType = accountType;
        this.accountBalance = balance;
    }

    private long generateAccountNumber() {
        return nextAccountNumber++;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void printInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + accountBalance);
 
    }
}
