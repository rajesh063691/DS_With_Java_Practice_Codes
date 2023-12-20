import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //int[] arr = {10, 10, 30, 20, 50, 50, 40, 70, 60};
        //int[] arr = {-1, -2, -3, 89, 90, -7, 0};
        int[] arr = {3, 1, 5, 4, 2};
        System.out.println(Arrays.toString(arr));
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }


    // step 1: iterate the first loop till N-1 times i.e i=0&& i<length-1
    // step 2: iterate the 2nd loop from 1st item till array is not sorted i.e j=1&&j>length-i(every time i increase bigger item will go to last)
    // step 3: swap the items if item at jth index is greater than item at j-1 th index
    // to enhance the code  - if array is already sorted then no need to iterate for i=1 and onwards
    // step 4: take a boolean value and see if in first iteration if no value is getting swapped then break the first loop means array is already sorted

    static void bubble(int[] arr) {
        boolean isSwapped;
        // step1
        for (int i = 0; i < arr.length; i++) {
            isSwapped = false;
            // step2
            for (int j = 1; j < arr.length - i; j++) {
                // step3
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;
                }
            }
            // swapped did not happen means array is already sorted so breaking the loop.
            if (!isSwapped) {
                break;
            }
        }
    }
}