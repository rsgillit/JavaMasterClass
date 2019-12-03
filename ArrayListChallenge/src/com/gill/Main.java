package com.gill;

import com.gill.bank.Bank;
import com.gill.bank.Branch;
import com.gill.bank.Customer;

public class Main {

    public static void main(String[] args) {
//	    MobilePhone mobilePhone = new MobilePhone("123");
//        Contact oldRashpal = new Contact("123", "Rashpal");
//        mobilePhone.addNumber(oldRashpal);
//        mobilePhone.addNumber("12333", "Jaspreet");
//        mobilePhone.addNumber("123444", "Satwant");
//        Contact newRashpal = new Contact("456", "Rashpal");
//        mobilePhone.printList();
//        boolean update = mobilePhone.updateContact(oldRashpal, newRashpal);
//        System.out.println(update);
//        mobilePhone.printList();
//        mobilePhone.removeNumber("Jaspreet");
//	    mobilePhone.printList();
        Bank bank = new Bank("First Bank");
        Branch branch1 = new Branch("Dallas");
        Branch branch2 = new Branch("Murphy");
        Customer customer1 = new Customer("Rashpal", 100);
        Customer customer2 = new Customer("Jaspreet", 200);
        Customer customer3 = new Customer("Rashpal", 100);
        Customer customer4 = new Customer("Jaspreet", 200);

        bank.addBranch(branch1);
        bank.addBranch(branch2);
        bank.addCustomer(customer1, branch1);
        bank.addCustomer(customer2, branch1);
        bank.addCustomer(customer3, branch2);
        bank.addCustomer(customer4, branch2);
        bank.deposit(customer1,branch1,500);
        bank.deposit(customer1,branch1,1000);
        bank.deposit(customer1,branch1,1500);
        bank.deposit(customer2,branch1,700);
        bank.deposit(customer4,branch2,700);
        bank.deposit(customer4,branch2,900);
        bank.deposit(customer4,branch2,1100);

        bank.printBranchDetails();


    }
}
