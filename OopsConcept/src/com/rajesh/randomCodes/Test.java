package com.rajesh.randomCodes;


import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.rajesh.randomCodes.User;

public class Test {

    public static void main(String[] args) {
//        Function<Integer, String> f = (t) -> "output :: " + t;
//        System.out.println(f.apply(10));


        List<User> users = Stream.of(
                new User("user1", "8786543234", Arrays.asList("abc@gmail.com", "bcd@gmail.com")),
                new User("user2", "1786543234", Arrays.asList("abc@gmail.com", "bcd@gmail.com"))).collect(Collectors.toList());

        List<String> phoneNumbers = users.stream().map(User::getNumber).collect(Collectors.toList());
        // System.out.println(phoneNumbers);

        List<List<String>> emailList = users.stream().map(User::getEmail).collect(Collectors.toList());
        // System.out.println(emailList);

        // use flatMap to get all the emails as single list
        List<String> emailString = users.stream().flatMap(u -> u.getEmail().stream()).collect(Collectors.toList());
        //System.out.println(emailString);


        List<User> users1 = Stream.of(
                new User("user1", "8786543234", Arrays.asList("abc@gmail.com", "bcd@gmail.com"), 90000, "dev"),
                new User("user2", "9786543234", Arrays.asList("abc@gmail.com", "bcd@gmail.com"), 100000, "dev"),
                new User("user3", "9786543234", Arrays.asList("abc@gmail.com", "bcd@gmail.com"), 100000, "qa"),
                new User("user4", "1786543234", Arrays.asList("abc@gmail.com", "bcd@gmail.com"), 120000, "qa")).collect(Collectors.toList());

       // approach 1
        Comparator<User> salaryComparator = Comparator.comparing(User::getSalary);
        Map<String, Optional<User>> getMaxSalaryByGroup = users1.stream().
                collect(
                        Collectors.groupingBy(User::getDept,
                                Collectors.reducing(BinaryOperator.maxBy(salaryComparator)))
                );

        for (Map.Entry<String, Optional<User>> mp : getMaxSalaryByGroup.entrySet()) {
            System.out.print(mp.getKey()+" :: ");
            System.out.println(mp.getValue().get().getSalary());
        }

       // System.out.println(getMaxSalaryByGroup);

    }
}
