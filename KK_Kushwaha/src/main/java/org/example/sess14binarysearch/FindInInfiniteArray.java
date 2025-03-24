package org.example.sess14binarysearch;

public class FindInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 44, 55, 66, 77, 88, 99, 100};
        int start = 0;
        int end = 2;
        int target = 7;
        while (true) {
            if (target <= arr[end]) {
                break;
            } else {
                start = end + 1;
                end = 2 * end;
            }
        }

        int ans = search(arr, start, end, target);
        System.out.println(ans);
    }


    public static int search(int[] arr, int start, int end, int target) {
        if (arr.length == 0) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
