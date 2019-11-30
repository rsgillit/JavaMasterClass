package com.gill.bank;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactionList = new ArrayList<>();
    private double balance;

    public Customer(String name, double amount) {
        this.name = name;
        this.transactionList.add(amount);
        balance = amount;
    }

    public void deposit(double amount) {
        this.transactionList.add(amount);
        balance += amount;
        System.out.println("deposting " + amount + " to customer " + name);
    }

    public void withdraw(double amount) {
        this.transactionList.add(amount);
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public String printDetails() {
        return transactionList.toString();
    }

    public String getName() {
        return name;
    }
}
