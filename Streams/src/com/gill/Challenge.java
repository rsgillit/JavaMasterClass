package com.gill;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Challenge {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("aaabc1", "afbc2", "abc3");
        List<String> str = list.stream().skip(1)
                .map(element -> element.substring(0, 2)).sorted().collect(Collectors.toList());
        System.out.println(str);

        counter = 0;
        Stream<String> stream1 = list.stream().filter(element -> {
            wasCalled();
            return element.contains("2");
        });
        System.out.println(counter);

        Optional<String> stream = list.stream().filter(element -> {
        System.out.println("filter() was called");
        return element.contains("2");
                }).map(element -> {
        System.out.println("map() was called");
        return element.toUpperCase();
                }).findFirst();

    }

    static private long counter;

    static private void wasCalled() {
        counter++;
    }
}
