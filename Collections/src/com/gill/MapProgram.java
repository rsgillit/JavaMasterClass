package com.gill;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

        languages.remove("Java", "hi");




    }
}
