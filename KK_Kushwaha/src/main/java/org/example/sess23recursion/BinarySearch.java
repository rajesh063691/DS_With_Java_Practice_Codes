package org.example.sess23recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 101, 102, 103, 104, 105};
        int target = 105;
        int ans = search(arr, 0, arr.length - 1, target);
        System.out.println(ans);
    }

    public static int search(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] < target) {
            return search(arr, mid + 1, end, target);
        } else {
            return search(arr, start, mid - 1, target);
        }
    }

}
