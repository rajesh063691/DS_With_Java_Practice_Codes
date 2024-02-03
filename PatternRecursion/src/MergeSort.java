import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {8, 3, 9};
        //System.out.println(Arrays.toString(mergeSort(arr)));
        //mergeInPlace(arr, 0, 2, 6);
        inPlaceMergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        // base condition
        if (arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int[] mergedArray = new int[left.length + right.length];
        int k = 0;
        int i = 0;
        int j = 0;

        for (i = 0, j = 0; i < left.length && j < right.length; ) {
            if (left[i] <= right[j]) {
                mergedArray[k] = left[i];
                i++;
            } else {
                mergedArray[k] = right[j];
                j++;
            }
            k++;
        }
        // now check in both the arrays for left overs and add the remaining in the array.
        //for left array
        while (i < left.length) {
            mergedArray[k] = left[i];
            i++;
            k++;
        }

        //for right array
        while (j < right.length) {
            mergedArray[k] = right[j];
            j++;
            k++;
        }
        return mergedArray;
    }

    // this will not use extra space for soritng the array instead it will use the indexes
    static void inPlaceMergeSort(int[] arr, int start, int end) {
        // base condition - when there is 2 elements left return
        if (end - start == 1) {
            return;
        }
        int mid = start + (end - start) / 2;
        inPlaceMergeSort(arr, start, mid);
        inPlaceMergeSort(arr, mid, end);
        mergeInPlace(arr, start, mid, end);
    }

    static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;
        while (i < mid && j < end) {
            if (arr[i] <= arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // now check in both the arrays for left overs and add the remaining in the array.
        //for left array
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        //for right array
        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        // now mix array have sorted values - So, use that to update the original array
        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }

}


