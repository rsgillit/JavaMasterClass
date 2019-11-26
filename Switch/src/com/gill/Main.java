package com.gill;

public class Main {

    public static void main(String[] args) {

        int value = 1;
        if(value == 1) {
            System.out.println("value was 1");
        } else if (value==2){
            System.out.println("value was 2");
        }

        int switchValue = 3;
        switch (switchValue) {
            case 1:
                System.out.println("value was 1");
                break;

            case 2:
                System.out.println("value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("value was 3 or 4 or 5");
                break;

            default:
                System.out.println("value was not 1 or 2");

        }
    }
}
