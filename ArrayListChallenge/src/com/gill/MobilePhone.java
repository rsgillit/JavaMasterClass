package com.gill;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> contactList = new ArrayList<>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    public void addNumber(String number, String name) {
        addNumber(new Contact(number, name));
        System.out.println("Number, Name: " + number + "->" + name + " added");
    }

    public void addNumber(Contact contact) {
        contactList.add(contact);
    }

    public boolean removeNumber(String name) {
        int pos = this.findContact(name);
        if( pos != -1) {
            contactList.remove(pos);
             return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int pos = findContact(oldContact);
        if(pos != -1 ) {
            contactList.set(pos,newContact);
            return true;
        }
        return false;

    }

    private int findContact(Contact contact){
        return contactList.indexOf(contact);
    }

    private int findContact(String name) {
        for(int i=0;i<contactList.size();i++) {
            Contact contact = contactList.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void printList() {
        for(int i=0;i<contactList.size();i++) {
            System.out.println(contactList.get(i).getName() + ":" + contactList.get(i).getNumber());
        }
    }
}
