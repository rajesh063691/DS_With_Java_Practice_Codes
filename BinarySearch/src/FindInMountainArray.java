import java.util.Arrays;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int ans = search(arr, target);

        System.out.printf("Minimum index of value %d is %d", target, ans);

    }


    static int search(int[] arr, int target) {
        // 1. find the peak element
        // 2. search for left side of array - start = 0 to end = peak
        // 3. search for right side of array - start = peak+1 to end = arr.length-1
        int peakIndex = peakIndexInMountainArray(arr);
        int leftIndex = BinSearch(arr, 0, peakIndex, target);
        if (leftIndex != -1) {
            return leftIndex;
        }
        return BinSearch(arr, peakIndex + 1, arr.length - 1, target);
    }


    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start != end) {
            int mid = start + (end - start) / 2;
            // means array is in descending order
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }
            // array is in ascending order
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        // start and end points to same, so you can return either start or end
        return start;
    }

    static int BinSearch(int[] arr, int start, int end, int target) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }

        }
        return -1;
    }

}
