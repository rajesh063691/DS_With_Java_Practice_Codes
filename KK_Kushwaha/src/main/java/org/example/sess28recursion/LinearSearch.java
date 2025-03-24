package org.example.sess28recursion;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 8, 0};
        int target = 0;
        // System.out.println(isTargetFound(arr, target, 0));
        //System.out.println(isTargetExists(arr, target, 0));
        // System.out.println(search(arr, target));
        System.out.println(helper(arr, target, 0));
    }

    static int isTargetFound(int[] arr, int target, int start) {
        if (start > arr.length - 1 || arr.length == 0) {
            return -1;
        }
        if (arr[start] == target) {
            return start;
        } else {
            return isTargetFound(arr, target, start + 1);
        }

    }

    static boolean isTargetExists(int[] arr, int target, int start) {
        if (start == arr.length) {
            return false;
        }

        return arr[start] == target || isTargetExists(arr, target, start + 1);

    }


    static List<Integer> search(int[] arr, int target) {
        List<Integer> list = new ArrayList<>();
        return helper(arr, list, target, 0);
    }

    // type 1 when we pass list in arguments
    static List<Integer> helper(int[] arr, List<Integer> ans, int target, int start) {
        if (start == arr.length) {
            return ans;
        }

        if (arr[start] == target) {
            ans.add(start);
        }

        return helper(arr, ans, target, start + 1);
    }


    // type 2 when we create list inside the body
    static List<Integer> helper(int[] arr, int target, int start) {
        List<Integer> list = new ArrayList<>();

        if (start == arr.length) {
            return list;
        }

        if (arr[start] == target) {
            list.add(start);
        }

        List<Integer> listAns = helper(arr, target, start + 1);
        if (!listAns.isEmpty()) {
            list.addAll(listAns);
        }

        return list;
    }


}
