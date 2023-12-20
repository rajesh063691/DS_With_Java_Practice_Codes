import java.util.Arrays;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 1, 4};
        System.out.println(missingNumber(arr));
    }

    // step1: sort the array using cyclic sort
    // step2: loop through 0 to n to find the missing numbers
    static int missingNumber(int[] nums) {
        int i = 0;
        int len = nums.length; // because item should be n+1 bcoz it starts from 0
        // step 1
        while (i < len) {
            // if you find nth value at any position ignore bcoz we can not increase the size of the array
            if (nums[i] == len) {
                i++;
                continue;
            }
            int correct = nums[i];
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        // now array is sorted - iterate over array to check the missing numbers
        for (int j = 0; j < len; j++) {
            if (nums[j] != j) {
                return j;
            }
        }
        //  when number is not in the array then length should be the answer
        return len;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
