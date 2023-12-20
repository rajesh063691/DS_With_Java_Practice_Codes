public class RotatedBinarySearch {
    public static void main(String[] args) {
        //int[] arr = {4,4,5,6,6,6,7,8,9,8,0,0,1,2,2};
        int[] arr = {2, 9, 2, 2, 2};
        int target = 7;
        //System.out.println(search(arr, target));
        System.out.println(findPeakIndex(arr));
    }

    static int search(int[] nums, int target) {
        int pivot = findPeakIndex(nums);
        // means no pivot found then do a normal binary search in whole array
        if (pivot == -1) {
            return BinarySearch(nums, target, 0, nums.length - 1);
        }

        if (target == nums[pivot]) {
            return pivot;
        }

        if (target >= nums[0]) {
            return BinarySearch(nums, target, 0, pivot - 1);
        }
        // means target not found in left side of array
        return BinarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // case 1
            // need to check the stack out of bound condition
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // case 2
            // need to check the stack out of bound condition
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // case 3 - ans lies before mid
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                // case 4 - ans lies after mid
                start = mid + 1;
            }
        }
        return -1;
    }
}
