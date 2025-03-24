package org.example.java8.mapflatMap;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<Customer> customers = EKartDatabase.getAll();

        // map if used for data transformation
        // find list of emails for all employees
        List<String> emails = customers.stream().map(Customer::getEmail).collect(Collectors.toList());
        System.out.println(emails);

        // fetch all the phone numbers as listoflistof string
        List<List<String>> phones = customers.stream().map(Customer::getPhoneNumber).collect(Collectors.toList());
        System.out.println(phones);

        // we need as list of string only so have to use flatMap
        List<String> phoneNumbers = customers.stream().flatMap(customer -> customer.getPhoneNumber().stream()).collect(Collectors.toList());
        System.out.println(phoneNumbers);
    }
}
