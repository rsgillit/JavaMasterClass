package com.gill;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 21);
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

        Function<Employee, String> getLastName = (Employee employee) -> {
            return employee.getName().substring(employee.getName().indexOf(' ') + 1);
        };

        String lastName = getLastName.apply(employees.get(1));
        System.out.println(lastName);

        Function<Employee, String> getFirstName = (Employee employee) -> {
            return employee.getName().substring(0, employee.getName().indexOf(' ') );
        };

        String firstName = getFirstName.apply(employees.get(1));
        System.out.println(firstName);

        Random random1 = new Random();
        for(Employee employee : employees) {
            if(random1.nextBoolean()) {
                System.out.println(getName(getFirstName, employee));
            } else {
                System.out.println(getName(getFirstName, employee));
            }
        }

//        printEmployeesByAge(employees, "employee's age greater than 30", employee -> employee.getAge()>30);
//        printEmployeesByAge(employees, "\nemployee's age 30 and under", employee -> employee.getAge()<=30);
//
//        printEmployeesByAge(employees, "\nemployee's age younger than 25", employee -> employee.getAge() <25);
//
//
//        IntPredicate greaterThan15 = i -> i > 15;
//        IntPredicate lessThan100 = i -> i < 100;
//
//        System.out.println(greaterThan15.test(10));
//        int a = 20;
//        System.out.println(greaterThan15.test(a + 5));
//        System.out.println(greaterThan15.and(lessThan100).test(150));
//
//        Random random = new Random();
//        Supplier<Integer> randomSupplier = ()-> random.nextInt(1000);
//
//        for(int i=0;i<10;i++) {
//            System.out.println(randomSupplier.get() );
//        }
//
//        employees.forEach(employee -> {
//            String lastName = employee.getName().substring(employee.getName().indexOf(' ') + 1);
//            System.out.println("Last name is: " + lastName);
//        });
    }

    private static String getName(Function<Employee, String> getName, Employee employee) {
        return getName.apply(employee);
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


