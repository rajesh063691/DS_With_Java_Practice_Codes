package org.example.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        list.add(105);
        list.add(1);
        list.add(5);

        // sort the list using java8
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
