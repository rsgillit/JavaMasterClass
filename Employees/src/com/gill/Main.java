package com.gill;

import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim B", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);
        Employee red = new Employee("Red Ridinghood", 35);
        Employee charming = new Employee("Prince charming", 31);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);
        employees.add(red);
        employees.add(charming);
        printEmployeesByAge(employees, "employee's age greater than 30", employee -> employee.getAge()>30);
        printEmployeesByAge(employees, "\nemployee's age 30 and under", employee -> employee.getAge()<=30);

        printEmployeesByAge(employees, "\nemployee's age younger than 25", employee -> employee.getAge() <25);


        IntPredicate intp = i -> i > 15;
        System.out.println(intp.test(10));
        int a = 20;
        System.out.println(intp.test(a + 5));
    }

    private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition) {
        System.out.println("=================");
        System.out.println(ageText);
        System.out.println("=================");
        for(Employee employee : employees) {
            if(ageCondition.test(employee)) {
                System.out.println(employee.getName());

            }
        }
    }
}


