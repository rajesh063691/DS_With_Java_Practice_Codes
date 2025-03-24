package org.example.java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Rajesh", 1);
        mp.put("Kumar", 3);
        mp.put("Yadav", 2);
        mp.put("test", 4);

        // sort the map based on the key
        // mp.entrySet().stream().sorted((o1, o2) -> o1.getValue().compareTo(o2.getValue())).forEach(System.out::println);
        // mp.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        // sort the object using different fields

        Map<Integer, Employee> empMap = new HashMap<>();
        empMap.put(10, new Employee(1, "Rajesh", 10000, 33));
        empMap.put(11, new Employee(2, "Puja", 20000, 27));
        empMap.put(12, new Employee(3, "Prisha", 30000, 2));

        // sort the map using employee name
        empMap.entrySet().stream().sorted((Map.Entry.comparingByValue(Comparator.comparing(Employee::getName).reversed()))).
                forEach(System.out::println);

    }
}
