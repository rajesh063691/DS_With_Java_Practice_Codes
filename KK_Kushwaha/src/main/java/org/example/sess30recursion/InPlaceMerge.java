package org.example.sess30recursion;

import java.util.Arrays;

public class InPlaceMerge {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        inPlaceMergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }


    static void inPlaceMergeSort(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }

        int mid = start + (end - start) / 2;

        inPlaceMergeSort(arr, start, mid);
        inPlaceMergeSort(arr, mid, end);
        mergeArr(arr, start, mid, end);
    }

    static void mergeArr(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;


        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                k++;
                i++;
            } else {
                mix[k] = arr[j];
                k++;
                j++;
            }
        }

        // now put the remaining of left and right to new array

        while (i < mid) {
            mix[k] = arr[i];
            k++;
            i++;
        }

        while (j < end) {
            mix[k] = arr[j];
            k++;
            j++;
        }


        // now copy the new to original one
        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }
}
