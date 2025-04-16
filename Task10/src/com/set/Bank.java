package com.set;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<Long, Account> accounts = new HashMap<>();

    public void createAccount(Customer customer, String accountType, float balance) {
        Account account = new Account(customer, accountType, balance);
        accounts.put(account.getAccountNumber(), account);
        System.out.println("Account created successfully. Account Number: " + account.getAccountNumber());
    }

    public float getAccountBalance(long accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            return accounts.get(accountNumber).getAccountBalance();
        } else {
            System.out.println("Account not found.");
            return -1;
        }
    }

    public float deposit(long accountNumber, float amount) {
        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            account.setAccountBalance(account.getAccountBalance() + amount);
            return account.getAccountBalance();
        } else {
            System.out.println("Account not found.");
            return -1;
        }
    }

    public float withdraw(long accountNumber, float amount) {
        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            if (amount <= account.getAccountBalance()) {
                account.setAccountBalance(account.getAccountBalance() - amount);
                return account.getAccountBalance();
            } else {
                System.out.println("Insufficient balance for withdrawal.");
                return -1;
            }
        } else {
            System.out.println("Account not found.");
            return -1;
        }
    }

    public void transfer(long fromAccountNumber, long toAccountNumber, float amount) {
        float fromBalance = withdraw(fromAccountNumber, amount);
        if (fromBalance != -1) {
            deposit(toAccountNumber, amount);
            System.out.println("Transfer successful.");
        } else {
            System.out.println("Transfer failed.");
        }
    }

    public void getAccountDetails(long accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            account.printInfo();
        } else {
            System.out.println("Account not found.");
        }
    }
}
