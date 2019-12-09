package com.gill;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level");
        languages.put("Python", "interpreted, OOP language");
        languages.put("ALGOL", " Alogorithmic ");
        languages.put("BASIC", "basic");
        languages.put("LISP", "madness");


        System.out.println(languages.get("Java"));
        if(languages.containsKey("Java")) {
            System.out.println("Java already exists");;
        }
        for(String key : languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }

        System.out.println(languages.;

        languages.remove("Java", "hi");
        System.out.println(languages.toString());



    }
}
