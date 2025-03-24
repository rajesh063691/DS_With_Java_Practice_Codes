package com.rajesh.collection;

import com.sun.source.tree.Tree;

import java.util.*;

public class HashSetOperations {

    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(40);

        for (Integer ele : hs) {
            System.out.println(ele);
        }

        System.out.println(hs);

        // get values from Set
        //  1. convert set to Array
        Integer[] arr = hs.toArray(new Integer[hs.size()]);
        System.out.println(Arrays.toString(arr));

        Random rndm = new Random();
        int num = rndm.nextInt(hs.size());
        System.out.println(arr[num]);

        // convert set to ArrayList
        List<Integer> list = new ArrayList<>(hs);
        Collections.sort(list);
        System.out.println(list);

        // convert the set to TreeSet - TreeSet by defaults store the data in ascending order
        Set<Integer> ts = new TreeSet<>(hs);
        System.out.println(ts);
    }
}
