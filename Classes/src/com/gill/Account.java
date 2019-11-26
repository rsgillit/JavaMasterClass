package com.gill;

public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    public Account() {
        this("4534", 2.5, "defualtname", "default address", "deault phone");
        System.out.println("Empty constructor called");
    }

    public Account(String accountNumber, double balance, String customerName, String emailAddress, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName =customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        System.out.println("Account constructor with parameters called");

    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public void depositFunds(double depositAmount){
        this.balance += depositAmount;
        System.out.println("deposited: " + depositAmount + " New balance: " + this.getBalance());
    }

    public void withdrawFunds(double withdrawlAmount){
        if(withdrawlAmount > this.balance) {
            System.out.println("Could not withdraw " + withdrawlAmount + " , only " + this.getBalance() + " available");
        } else {
            this.balance -= withdrawlAmount;
            System.out.println("withdrawn: " + withdrawlAmount + " New balance: " + this.getBalance());
        }

    }
}
