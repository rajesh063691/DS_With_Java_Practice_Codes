package com.rajesh.collection;

import java.util.*;

public class RemoveDuplicate {

    public static <T> ArrayList<T> removeDuplicate(ArrayList<T> list) {
        ArrayList<T> newList = new ArrayList<T>();

        for (T element : list) {

            if (!(newList.contains(element))) {
                newList.add(element);
            }
        }

        return newList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
        System.out.println(list);
        ArrayList<Integer> newList = removeDuplicate(list);
        Collections.sort(newList);
        System.out.println(newList);


        ArrayList<String> ll = new ArrayList<>(Arrays.asList("Rajesh", "Puja", "Manish", "Rajesh", "Rohit"));
        System.out.println(ll);
        ArrayList<String> newll = removeDuplicate(ll);
        Collections.sort(newll);
        System.out.println(newll);
    }
}
