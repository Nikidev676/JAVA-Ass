package com.set;

public class Customer {
    private static int nextCustomerId = 1001;

    private int customerId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private String address;

    public Customer() {
        this.customerId = generateCustomerId();
    }

    public Customer(String firstName, String lastName, String emailAddress, String phoneNumber, String address) {
        this.customerId = generateCustomerId();
        this.firstName = firstName;
        this.lastName = lastName;
        setEmailAddress(emailAddress);
        setPhoneNumber(phoneNumber);
        this.address = address;
    }

    private int generateCustomerId() {
        return nextCustomerId++;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        if (emailAddress.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            this.emailAddress = emailAddress;
        } else {
            System.out.println("Invalid email address format.");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.matches("\\d{10}")) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Invalid phone number format.");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printInfo() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email Address: " + emailAddress);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }
}
