package com.gill;

import javax.management.OperationsException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class Main {

    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("data.txt");
            FileChannel channel = file.getChannel();

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
