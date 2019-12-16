package com.gill;

import static com.gill.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+ "Hello from the main thread");

        AnotherThread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();


        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
           @Override
           public void run() {
               System.out.println(ANSI_RED+ "Hello from the anonymous class's implementation of Runnable");
               try {
                   anotherThread.join();
                   System.out.println(ANSI_RED + "AnotherThread terminated so I am running again");
               } catch(InterruptedException e) {
                   System.out.println(ANSI_RED + "I couldn't wait after all , I was interrupted");
               }
           }
        });

        //Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();
        //anotherThread.interrupt();

        System.out.println(ANSI_PURPLE + "Hello again from the main thread");


    }
}
