package com.rajesh.collection;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for (Integer number : list) {
            System.out.println("Number :: " + number);
        }
        System.out.println("<===============>");
        System.out.println("<===============>");

        list.remove(list.size() - 1);

        for (Integer number : list) {
            System.out.println("Number :: " + number);
        }

        System.out.println("<===============>");
        System.out.println("<===============>");
        Integer val = Integer.valueOf(60);

        list.remove(val);
        for (Integer number : list) {
            System.out.println("Number :: " + number);
        }

        System.out.println("<======USING ITERATOR=========>");
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            int x = (Integer) itr.next();
            if (x <= 10) {
                itr.remove();
            }
        }
        System.out.println(list);
    }

}
