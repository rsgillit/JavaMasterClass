package com.gill;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] myIntArray = new int[100];
	    myIntArray[5] = 50;

        for(int i=0;i<myIntArray.length;i++){
            myIntArray[i] = i*10;
        }

        int [] myIntegers = getIntegers(5);

        printArray(myIntegers);
        System.out.println("Average: " + getAverage(myIntegers));
//	    for(int i=0;i<myIntArray.length;i++){
//            System.out.println(i + ":" + myIntArray[i]);
//        }

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values \r");
        int[] values = new int[number];

        for(int i=0; i< values.length;i++) {
            values[i] = scanner.nextInt();
        }
        return values;

    }

    public static  double getAverage(int[] array) {
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum += array[i];
        }

        return sum / array.length;
    }

    public static  void printArray(int[] array) {
        for(int i=0;i<array.length;i++){
            System.out.println(i + ":" + array[i]);
        }
    }
}
