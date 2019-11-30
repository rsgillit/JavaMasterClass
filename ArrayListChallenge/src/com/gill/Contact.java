package com.gill;

public class Contact  {
    private String name;
    private String number;


    public Contact(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
