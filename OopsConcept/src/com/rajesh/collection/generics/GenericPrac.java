package com.rajesh.collection.generics;

public class GenericPrac {

    // create one method to count the total occurance of given number in the generic way

    public static <T> int count(T[] arr, T x) {
        int totalCount = 0;

        for (T e : arr) {
            if (e instanceof String str) {

                if (str.toLowerCase().equals(x)) {
                    totalCount++;
                }
            } else if (e instanceof Integer) {
                if (e.equals(x)) {
                    totalCount++;
                }
            }

        }
        return totalCount;
    }

    public static void main(String[] args) {
//        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 7, 6, 5, 4, 7};
//        int search = 7;
//        int res = count(arr, search);
//
//        System.out.println(search + " occurred " + res + " times.");

        String[] str = {"Rajesh", "Rajesh", "rajesh", "puja"};
        String s = "rajesh";
        int result = count(str, s);
        System.out.println(s + " occurred " + result + " times.");
    }
}
