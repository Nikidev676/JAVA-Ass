package com.set;


import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "Enter a command ('create_account', 'get_balance', 'deposit', 'withdraw', 'transfer', 'getAccountDetails', 'exit'): ");
            String command = scanner.next();

            switch (command.toLowerCase()) {
                case "create_account":
                    Customer customer = createCustomer(scanner);
                    System.out.println("Select account type ('Savings' or 'Current'): ");
                    String accountType = scanner.next();
                    System.out.println("Enter initial balance: ");
                    float balance = scanner.nextFloat();
                    bank.createAccount(customer, accountType, balance);
                    break;

                case "get_balance":
                    System.out.println("Enter account number: ");
                    long accountNumber = scanner.nextLong();
                    float bal = bank.getAccountBalance(accountNumber);
                    if (bal != -1) System.out.println("Account balance: " + bal);
                    break;

                case "deposit":
                    System.out.println("Enter account number: ");
                    long depositAcc = scanner.nextLong();
                    System.out.println("Enter deposit amount: ");
                    float depositAmt = scanner.nextFloat();
                    float newDepositBal = bank.deposit(depositAcc, depositAmt);
                    if (newDepositBal != -1) System.out.println("Deposit successful. New balance: " + newDepositBal);
                    break;

                case "withdraw":
                    System.out.println("Enter account number: ");
                    long withdrawAcc = scanner.nextLong();
                    System.out.println("Enter withdrawal amount: ");
                    float withdrawAmt = scanner.nextFloat();
                    float newWithdrawBal = bank.withdraw(withdrawAcc, withdrawAmt);
                    if (newWithdrawBal != -1) System.out.println("Withdrawal successful. New balance: " + newWithdrawBal);
                    break;

                case "transfer":
                    System.out.println("Enter source account number: ");
                    long fromAcc = scanner.nextLong();
                    System.out.println("Enter target account number: ");
                    long toAcc = scanner.nextLong();
                    System.out.println("Enter transfer amount: ");
                    float transferAmt = scanner.nextFloat();
                    bank.transfer(fromAcc, toAcc, transferAmt);
                    break;

                case "getaccountdetails":
                    System.out.println("Enter account number: ");
                    long detailAcc = scanner.nextLong();
                    bank.getAccountDetails(detailAcc);
                    break;

                case "exit":
                    System.out.println("Exiting BankApp. Thank you!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
    }

    private static Customer createCustomer(Scanner scanner) {
        System.out.println("Enter customer details:");
        System.out.print("First Name: ");
        String firstName = scanner.next();
        System.out.print("Last Name: ");
        String lastName = scanner.next();
        System.out.print("Email Address: ");
        String emailAddress = scanner.next();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.next();
        System.out.print("Address: ");
        scanner.nextLine(); // Clear buffer
        String address = scanner.nextLine();
        return new Customer(firstName, lastName, emailAddress, phoneNumber, address);
    }
}
