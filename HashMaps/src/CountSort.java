import java.util.Arrays;

public class CountSort {
    public static void CountSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        // find the largest element
        int max = 0;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        // create an countArray array with size = largest+1
        int[] countArray = new int[max + 1];

        // iterate over the original array and update the value count in the countArray
        for (int num : arr) {
            countArray[num] = countArray[num] + 1;
        }


        // now iterate over countArray and modify the original array
        int index = 0;
        for (int i = 0; i < max; i++) {
            while (countArray[i] > 0) {
                arr[index] = i;
                index++;
                countArray[i]--;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 3, 2, 5, 2, 8};
        CountSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
