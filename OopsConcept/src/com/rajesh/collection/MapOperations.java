package com.rajesh.collection;

import java.util.*;
import java.util.concurrent.*;

public class MapOperations {


    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Rajesh", Integer.valueOf(100));
        mp.put("Puja", Integer.valueOf(200));
        mp.put("Rohit", Integer.valueOf(300));
        mp.put("Manish", Integer.valueOf(400));

        System.out.println(mp);

        System.out.println("<=======HashMap======>");

        for (Map.Entry<String, Integer> m : mp.entrySet()) {
            System.out.print("Key :: " + m.getKey());
            System.out.println(" && Value :: " + m.getValue());
        }

        System.out.println("<=======LinkedHashMap======>");

        // LinkedHashMap
        Map<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("Rajesh", Integer.valueOf(100));
        lhm.put("Puja", Integer.valueOf(200));
        lhm.put("Rohit", Integer.valueOf(300));
        lhm.put("Manish", Integer.valueOf(400));
        lhm.put("Brajesh", Integer.valueOf(500));
        for (Map.Entry<String, Integer> m : lhm.entrySet()) {
            System.out.println("Key :: " + m.getKey() + " && Value :: " + m.getValue());
        }


        System.out.println("<=======TreeMap======>");

        // LinkedHashMap
        Map<String, Integer> tm = new TreeMap<>();
        tm.put("Rajesh", Integer.valueOf(100));
        tm.put("Puja", Integer.valueOf(200));
        tm.put("Rohit", Integer.valueOf(300));
        tm.put("Manish", Integer.valueOf(400));
        tm.put("Brajesh", Integer.valueOf(500));

        for (Map.Entry<String, Integer> m : tm.entrySet()) {
            System.out.println("Key :: " + m.getKey() + " && Value :: " + m.getValue());
        }

        System.out.println("<=======Traversing using iterator======>");
        Iterator<Map.Entry<String, Integer>> itr = tm.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            System.out.println("key :: " + entry.getKey() + " && Value :: " + entry.getValue());
        }


        System.out.println("<=======ConcurrentHashMap======>");
        // create an instance of ConcurrentHashMap
        ConcurrentHashMap<Integer, String> chmap
                = new ConcurrentHashMap<Integer, String>();
        // Add elements using put()
        chmap.put(8, "Third");
        chmap.put(6, "Second");
        chmap.put(3, "First");
        chmap.put(11, "Fourth");

        Iterator<Map.Entry<Integer, String>> cuitr = chmap.entrySet().iterator();
        while (cuitr.hasNext()) {
            Map.Entry<Integer, String> entry = cuitr.next();
            System.out.println("Key = " + entry.getKey() + " & Value = " + entry.getValue());
        }

    }
}
