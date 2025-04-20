package com.set;

import java.util.Scanner;

public class Bank {
    public Account createAccount() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Select account type:");
			System.out.println("1. Savings Account");
			System.out.println("2. Current Account");
			int choice = scanner.nextInt();

			System.out.print("Enter account number: ");
			int accountNumber = scanner.nextInt();

			System.out.print("Enter initial balance: ");
			double initialBalance = scanner.nextDouble();

			if (choice == 1) {
			    System.out.print("Enter interest rate for savings account: ");
			    double interestRate = scanner.nextDouble();
			    return new SavingsAccount(accountNumber, initialBalance, interestRate);
			} else if (choice == 2) {
			    System.out.print("Enter overdraft limit for current account: ");
			    double overdraftLimit = scanner.nextDouble();
			    return new CurrentAccount(accountNumber, initialBalance, overdraftLimit);
			} else {
			    System.out.println("Invalid choice. Returning a default Savings Account.");
			    return new SavingsAccount(accountNumber, initialBalance, 2.5);
			}
		}
    }
}
