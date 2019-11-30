package com.gill.bank;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branchList = new ArrayList<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void addBranch(Branch branch) {
        if(findBranch(branch) == -1) {
            branchList.add(branch);
        }
    }

    public void addCustomer(Customer customer, Branch branch) {
        int pos = findBranch(branch);
        if(pos != -1) {
            branchList.get(pos).addCustomer(customer);
        }
    }

    public void deposit(Customer customer, Branch branch, double amount) {
        int pos = findBranch(branch);
        if(pos != -1) {
            branchList.get(pos).deposit(customer,amount);
        }
    }

    public int findBranch(Branch branch) {
        for(int i =0 ; i<branchList.size();i++){
            Branch curbranch = branchList.get(i);
            if(curbranch.getBranchName().equals(branch.getBranchName()) ) {
                //System.out.println("Branch: " + branch.getBranchName() + " already exists");
                return i;
            }
        }
        return -1;
    }

    public void printBranchDetails() {
        for(int i=0;i<branchList.size();i++) {
            Branch branch = branchList.get(i);
            System.out.println("Branch Name: " + branch.getBranchName());
            branch.printCustomerDetails();
        }
    }



}
