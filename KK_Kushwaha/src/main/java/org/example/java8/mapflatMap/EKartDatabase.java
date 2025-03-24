package org.example.java8.mapflatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EKartDatabase {
    public static List<Customer> getAll() {
        return
                Stream.of(
                        new Customer(101, "rajesh", "rky@gmail.com", Arrays.asList("123456", "098765")),
                        new Customer(102, "puja", "puja@gmail.com", Arrays.asList("65789", "4321")),
                        new Customer(103, "prisha", "prisha@gmail.com", Arrays.asList("99999", "1111")),
                        new Customer(104, "test", "prisha@gmail.com", Arrays.asList("99999", "1111")),
                        new Customer(105, "test2", "prisha@gmail.com", Arrays.asList("99999", "1111"))

                ).collect(Collectors.toList());
    }
}
