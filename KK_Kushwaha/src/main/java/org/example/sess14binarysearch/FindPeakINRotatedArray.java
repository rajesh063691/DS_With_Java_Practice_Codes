package org.example.sess14binarysearch;

public class FindPeakINRotatedArray {
    public static void main(String[] args) {

    }


    public static int search(int[] nums, int target) {
        int peak = findPeakIndex(nums);

        //  if peak is the target element
        if (nums[peak] == target) {
            return peak;
        }

        int left = search(nums, 0, peak - 1, target);
        if (left == -1) {
            left = search(nums, peak + 1, nums.length - 1, target);
        }

        return left;
    }

    public static int findPeakIndex(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // in ascending order
            if (nums[mid] > nums[mid + 1]) {
                return mid;
            }
//            } else if (nums[mid] > nums[mid + 1]) {
//                end = mid;
//            }
        }
        return start;
    }

    public static int search(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
