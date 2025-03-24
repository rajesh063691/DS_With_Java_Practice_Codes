package org.example.sess14binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int target = 100;
        int foundIndex = binarySearch(arr, target, 0, arr.length - 1);
        if (foundIndex == -1) {
            System.out.println("target :: " + target + " not found");
        } else {
            System.out.println("target :: " + target + " found at index :: " + foundIndex);
        }

    }

    // returns the element found index
    static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
