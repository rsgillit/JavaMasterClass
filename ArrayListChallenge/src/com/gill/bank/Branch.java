package com.gill.bank;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customerList = new ArrayList<>();

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public void deposit(Customer customer, double amount) {
        int pos = findCustomer(customer);
        if( pos != -1 ) {
            System.out.println("deposting " + amount + " to branch " + branchName);
            customerList.get(pos).deposit(amount);
        }
    }

    public int findCustomer(Customer customer) {
        for(int i =0 ; i<customerList.size();i++){
            Customer curcustomer = customerList.get(i);
            if(curcustomer.getName().equals(customer.getName()) ) {
                //System.out.println("Branch: " + customerList.() + " already exists");
                return i;
            }
        }
        return -1;
    }

    public String getBranchName() {
        return branchName;
    }

    public void printCustomerDetails() {
        for(int i=0; i<customerList.size();i++) {
            Customer customer = customerList.get(i);
            System.out.println("Customer : " + customer.getName() + " : Balance:" + customer.getBalance());
            System.out.println(customer.printDetails());
        }
    }
}
