// https://leetcode.com/problems/first-missing-positive/description/
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(firstMissingPositive(arr));
    }

    static int firstMissingPositive(int[] nums) {
        int i = 0;
        int len = nums.length; // because item should be n+1 bcoz it starts from 0
        // step 1
        while (i < len) {
            // if you find nth or negative value at any position ignore bcoz we can not increase the length of the array
            if (nums[i] >= len || nums[i] <= 0) {
                i++;
                continue;
            }
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        // now array is sorted - iterate over array to check the missing numbers
        for (int j = 0; j < len; j++) {
            if (j != nums[j] - 1) {
                return j + 1;
            }
        }
        //  when number is not in the array then length+1 should be the answer
        return len+1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
