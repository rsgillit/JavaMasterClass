package com.gill;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of Birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        int yearOfBirth;
        if(hasNextInt) {
            yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2018 - yearOfBirth;
            if(age >= 0 && age <= 100) {
                System.out.println("Your name is " + name +", and you are " + age + " years old");
            } else {
                System.out.println("Invalid year of Birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }

        scanner.close();
    }
}
