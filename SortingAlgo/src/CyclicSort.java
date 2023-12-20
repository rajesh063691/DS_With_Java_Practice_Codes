import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};
        cyclicSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    // cyclic sort is applicable only when numbers are given like between 1-N or continuous elements like 3 5 2 1 4 if you sort this
    // then it becomes 1 2 3 4 5. so it has to be like any nth number's previous number should be exactly less than by 1 ok

    static void cyclicSorting(int[] arr) {
        int i = 0;
        int n = arr.length;
        while (i < n) {
            // check if ith index value is at correct position if yes then increment the ith position
            // else swap it with the correct position
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                // swap ith index value with arr[i]-1 th index
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
