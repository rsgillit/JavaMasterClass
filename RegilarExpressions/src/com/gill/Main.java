package com.gill;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String string = "I am a string. Yes, I am.";
        System.out.println(string);

        String yourString = string.replaceAll("I", "you");
        System.out.println(yourString);

        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("aaaaab");
        System.out.println(m.toString()); ;
    }
}
