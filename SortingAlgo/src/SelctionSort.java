import java.util.Arrays;

public class SelctionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3, -1, -2, 0};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    // start the loop i=0;i<length

    // step1: find the maximum item in the array by using simple linear search
    // step2: swap the maximum item at last index of array

    static void selectionSort(int[] arr) {
        int len = arr.length - 1;
        while (len > 0) {
            int maxIndex = findMaxValueIndex(arr, len);
            swap(arr, maxIndex, len);
            len = len - 1;
        }
    }


    // this return max item and max item index value
    static int findMaxValueIndex(int[] arr, int len) {
        int maxValue = arr[0];
        int maxIndex = 0;
        for (int i = 0; i <= len; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
