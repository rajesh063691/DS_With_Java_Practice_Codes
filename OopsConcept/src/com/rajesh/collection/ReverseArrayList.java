package com.rajesh.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

    public static ArrayList<Integer> reverse(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return list;
        }

        int mid = list.size() / 2;

        for (int i = 0; i < mid; i++) {
            int temp = list.get(i);
            list.set(i, list.size() - 1 - i);
            list.set(list.size() - 1 - i, temp);
        }

        return list;
    }

    // Iterate through all the elements and print
    public void printElements(ArrayList<Integer> alist) {
        for (int i = 0; i < alist.size(); i++) {
            System.out.print(alist.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        ReverseArrayList obj = new ReverseArrayList();
        ArrayList<Integer> arrayli = new ArrayList<Integer>();
        arrayli.add(Integer.valueOf(12));
        arrayli.add(Integer.valueOf(13));
        arrayli.add(Integer.valueOf(123));
        arrayli.add(Integer.valueOf(54));
        arrayli.add(Integer.valueOf(1));
        System.out.print("Elements before reversing: ");
        obj.printElements(arrayli);
        arrayli = obj.reverse(arrayli);
        System.out.print("\nElements after reversing: ");
        obj.printElements(arrayli);

        Collections.reverse(arrayli);
    }
}
