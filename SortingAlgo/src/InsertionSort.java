import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, -3, 5, -2, 0};
        insertionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    // start the 1st loop from 0 till len-2, i=0&&i<=len-2 OR i < len-1
    // start the second loop from next to 1st position means j=i+1 and it should be greater than 0 because 0 is the last position so no need to compare
    // if at any position jth element is not smaller than j-1th position then break because all the previous elements will already be sorted.

    static void insertionSorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    // swap the current index element with previous one
                    swap(arr, j, j - 1);
                } else {
                    // previous elements are already sorted
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
