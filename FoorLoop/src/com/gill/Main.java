package com.gill;

public class Main {

    public static void main(String[] args) {
        sum3and5();
    }

    public static void sum3and5(){
        long sum = 0;
        int counter = 0;
        for(int i=1;i<=1000 && counter < 5;i++){
            if( i % 3 == 0 && i % 5 == 0 ){
                System.out.println("NUmber is " + i);
                sum+=i;
                counter++;
            }
        }
        System.out.println("sum is " + sum);
    }

}
