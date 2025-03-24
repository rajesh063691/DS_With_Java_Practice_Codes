package org.example;

import java.io.*;
import java.util.*;
import java.util.stream.*;


public class Main {

    public static <K, V> Stream<Map.Entry<K, V>> ConvertToStream(Map<K, V> map) {
        Stream<Map.Entry<K, V>> stream = map.entrySet().stream();
        return stream;
    }


    public static void main(String[] args) throws Exception {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("A", 1);
        mp.put("B", 1);
        mp.put("C", 1);

        Stream<Map.Entry<String, Integer>> st = ConvertToStream(mp);
        st.forEach((o) -> System.out.println(o.getKey() + " :: " + o.getValue()));

    }
}

