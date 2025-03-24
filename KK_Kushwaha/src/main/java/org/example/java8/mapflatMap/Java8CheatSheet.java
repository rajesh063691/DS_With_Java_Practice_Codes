package org.example.java8.mapflatMap;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8CheatSheet {
    public static void main(String[] args) {
        List<Customer> customers = EKartDatabase.getAll();
        // customers.forEach(c -> System.out.println(c));

        Map<Integer, String> collect = customers.stream().collect(Collectors.toMap(Customer::getId, Customer::getName));
        // System.out.println(collect);


        Map<String, Long> collect1 = Stream.of("rajesh", "kumar", "yadav", "rajesh", "kumar", "yadav").collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()
        ));

        // System.out.println(collect1);

        // extract only email id
        List<String> str = customers.stream().map(Customer::getEmail).collect(Collectors.toList());
        // System.out.println(str);

        // fetch customers whose id is maximum

         customers.stream().max(Comparator.comparingDouble(Customer::getId));

    }
}
