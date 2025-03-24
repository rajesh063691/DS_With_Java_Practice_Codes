package interview.questions;

import java.util.Arrays;

public class SortArrays {

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxIndex = findMaxIndex(arr, 0, lastIndex);

            swap(arr, maxIndex, lastIndex);
        }

    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    private static int findMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int j = start; j <= end; j++) {
            if (arr[max] < arr[j]) {
                max = j;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
