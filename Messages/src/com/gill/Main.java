package com.gill;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Message message = new Message();
        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();

    }
}


class Message {
    private String message;
    private boolean empty = true;

    public synchronized String read() {
        while(empty) {
            try {
                wait();
                System.out.println("hi1");
            } catch(InterruptedException e) {
                System.out.println("got interrupted");
            }
        }
        empty = true;
        notifyAll();
        return message;
    }

    public synchronized void write(String message) {
        while(!empty) {
            try {
                wait();
                System.out.println("hi2");

            } catch(InterruptedException e) {
                System.out.println("got interrupted");
            }
        }
        empty = false;
        this.message = message;
        notifyAll();

    }
}

class Writer implements Runnable {
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String messages[] = {
                "Humpty Dumpty sat on a wall",
                "Humpty Dumpty had a great fall",
                "All the king's horses and allt he King's men",
                "couldn't put Humpty together again!"
        };

        Random random = new Random();

        for(int i=0;i<messages.length;i++) {
            message.write(messages[i]);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        message.write("Finished");
    }
}

class Reader implements Runnable {
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        Random random = new Random();

        for(String latestMessage = message.read(); !latestMessage.equalsIgnoreCase("Finished");
                latestMessage = message.read()) {
            System.out.println(latestMessage);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
