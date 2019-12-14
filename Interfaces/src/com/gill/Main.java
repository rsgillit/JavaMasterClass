package com.gill;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Bird bird = new Bird("Parrot");
        bird.breathe();
        bird.eat();

        Calendar c1 = Calendar.getInstance();
        c1.set(Calendar.MONTH, 12);
        c1.set(Calendar.DATE, 5);
        c1.set(Calendar.YEAR, 2019);

        Date dateOne = c1.getTime();

        //Calendar calendar = Calendar.getInstance();
        System.out.println(System.currentTimeMillis());
        //System.out.println("Date: "+ dateOne + Instant.now().getEpochSecond());
        System.out.println(c1.getTimeInMillis());

    }
}
