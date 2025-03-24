package org.example.sess30recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 3, 4, 12, 5, 6};
        System.out.println(Arrays.toString(arr));
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }


    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }


        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mergedArr = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mergedArr[k] = left[i];
                k++;
                i++;
            } else {
                mergedArr[k] = right[j];
                k++;
                j++;
            }
        }

        // now put the remainings of left and right to new array

        while (i < left.length) {
            mergedArr[k] = left[i];
            k++;
            i++;
        }

        while (j < right.length) {
            mergedArr[k] = right[j];
            k++;
            j++;
        }

        return mergedArr;
    }

}
