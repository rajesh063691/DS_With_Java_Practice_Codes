package org.example.sess14binarysearch;

public class PeakInMountainArray {
    public static void main(String[] args) {

    }

    public static int search(int[] arr, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            // means, I am in decreasing part
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }
            if (arr[mid] < arr[mid + 1]) { // in the increasing side of array
                start = mid + 1;
            }
        }
        // start abd end both will point to same element
        return start;
    }
}
