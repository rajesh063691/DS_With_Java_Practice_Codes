package org.example.sess28recursion;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 9, 12};
        // System.out.println(isSorted(arr));
        System.out.println(isASorted(arr, 0));
    }


    static boolean isSorted(int[] arr) {
        return helper(arr, 0, true);
    }

    static boolean helper(int[] arr, int start, boolean isSorted) {
        if (start == arr.length - 1 || arr.length == 0) {
            return true;
        }

        if (!isSorted) {
            return false;
        }

        isSorted = isArrSorted(arr, start);

        if (!isSorted) {
            return false;
        } else {
            return helper(arr, start + 1, true);
        }

    }

    private static boolean isArrSorted(int[] arr, int start) {
        return start + 1 <= arr.length - 1 && arr[start] <= arr[start + 1];
    }

// second approach
    static boolean isASorted(int[] arr, int start) {
        if (start == arr.length - 1 || arr.length == 0) {
            return true;
        }
        return (arr[start] < arr[start + 1]) && isASorted(arr, start + 1);
    }
}
