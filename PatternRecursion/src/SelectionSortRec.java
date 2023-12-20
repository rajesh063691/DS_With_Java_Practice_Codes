import java.util.Arrays;

public class SelectionSortRec {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 7, 1};
        //System.out.println(maxIndex(arr, 0, arr.length - 1, 0));
        selectionSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int[] arr, int start, int end) {
        if (end <= 0) {
            return;
        }
        if (start < end) {
            // check max ellement
            int maxIndex = maxIndex(arr, start, end, 0);
            // swap it with last element
            swap(arr, maxIndex, end);
            selectionSort(arr, 0, end - 1);
        }
    }

    static int maxIndex(int[] arr, int start, int end, int max) {

        if (start == end) {
            return max;
        }
        if (end < 0) {
            return -1;
        }
        if (arr[start + 1] > arr[max]) {
            max = start + 1;
        }
        return maxIndex(arr, start + 1, end, max);
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;

    }
}
