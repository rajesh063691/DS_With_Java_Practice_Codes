import java.util.Arrays;

public class BubbleSortRec {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int start, int end) {
        if (end <= 0) {
            return;
        }
        if (start < end) {
            if (arr[start] > arr[start + 1]) {
                swap(arr, start, start + 1);
            }
            bubbleSort(arr, start + 1, end);
        } else {
            bubbleSort(arr, 0, end - 1);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;

    }
}
