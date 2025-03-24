package org.example.sess32recursion;

import java.util.ArrayList;
import java.util.List;

public class StringSubset {
    public static void main(String[] args) {
        // subsets("", "abc");


//        List<String> list = subsetsList("", "abc");
//        System.out.println(list);

        subsetsUsingLop("abc");
    }


    static void subsets(String p, String up) {
        if (up.isEmpty()) {
            System.out.printf(p + " ");
            return;
        }
        String s = "" + up.charAt(0);
        subsets(p + s, up.substring(1));
        subsets(p, up.substring(1));
    }


    static List<String> subsetsList(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        String s = "" + up.charAt(0);
        List<String> left = subsetsList(p + s, up.substring(1));
        List<String> right = subsetsList(p, up.substring(1));
        left.addAll(right);
        return left;
    }


    static void subsetsUsingLop(String str) {
        if (str.isEmpty()) {
            return;
        }
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            String ans = String.valueOf(str.charAt(i));
            System.out.println(ans);
            for (int j = i + 1; j < str.length(); j++) {
                String local = ans + String.valueOf(str.charAt(j));
                System.out.println(local);
                local="";
            }
        }
    }
}
