package com.set.hexa;

public class Customer {

	public static void main(String[] args) {
	
	}
  // Private attributes for encapsulation
    private int customerId;
   
	private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private String address;
	
    // Default constructor
    public Customer() {
    }

    // Parameterized constructor
    public Customer(int customerId, String firstName, String lastName,
                    String emailAddress, String phoneNumber, String address) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    
    public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}
    
    public void setAddress(String address) {
        this.address = address;
    }

    public void printCustomerInfo() {
        System.out.println("Customer Information:");
        System.out.println("ID: " + customerId);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email: " + emailAddress);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Address: " + address);
    }

    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
                + ", emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
    }
}
