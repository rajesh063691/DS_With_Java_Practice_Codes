package org.example.sess29recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 9, 0};
        System.out.println(Arrays.toString(arr));
        selection(arr, arr.length - 1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }


    static void selection(int[] arr, int r, int c, int max) {
        if (r < 0) {
            return;
        }

        if (c <= r) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c + 1, c);
            } else {
                selection(arr, r, c + 1, max);
            }
        } else {
            // swap the maximum with the last position
            int temp = arr[r];
            arr[r] = arr[max];
            arr[max] = temp;
            selection(arr, r - 1, 0, 0);
        }
    }
}
