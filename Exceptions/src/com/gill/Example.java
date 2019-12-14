package com.gill;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
//        int x = 98;
//        int  y = 0;
//        System.out.println(divideLBYL(x, y));
//        System.out.println(divideEAFP(x, y));
//        System.out.println(divide(x, y));
        int result = divide();
        System.out.println(result);
    }

    private static int divide() {
        int x, y;
        try {
            x = getInt();
            y = getInt();

        } catch (NoSuchElementException e) {
            throw new ArithmeticException("no suitable input");
        }
            System.out.println("x is " + x + ", y is " + y);

        try {
            return x / y ;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("attempt to divide by zero");
        }
    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Please enter a number using only digits 0 to 9");
            }
        }
    }




}
