package org.example.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("rajesh");
        list.add("kumar");
        list.add("yadav");
        list.add("puja");

        // traditional way to iterate
//        for (String name : list) {
//            System.out.println(name);
//        }
        // iterate using foreach using java8
        //list.stream().forEach((t) -> System.out.println(t));


        // iterate over map

        Map<String, Integer> mp = new HashMap<>();
        mp.put("Rajesh", 1);
        mp.put("Kumar", 2);
        mp.put("Yadav", 3);
        mp.put("test", 4);

        //mp.entrySet().stream().forEach((t) -> System.out.println(t));
        mp.entrySet().stream().filter(m -> m.getValue() % 2 == 0).forEach(System.out::println);


        // list.stream().filter(s -> s.startsWith("ra")).forEach(t -> System.out.println(t));
    }
}
