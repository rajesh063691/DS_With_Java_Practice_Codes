public class RBSRecursion {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        int target = 12;
        System.out.println(RBS(arr, target, 0, arr.length - 1));
    }

    static int RBS(int[] arr, int target, int start, int end) {
        // base condition
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        // case: 1
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                // answer lies between start and end
                return RBS(arr, target, start, mid - 1);
            } else {
                return RBS(arr, target, mid + 1, end);
            }
        }
        // case: 2 - target lies in 2nd part of the array
        if (target >= arr[mid] && target <= arr[end]) {
            return RBS(arr, target, mid + 1, end);
        }
        // case: 3 - target lies in left side of array somewhere
        return RBS(arr, target, start, mid - 1);

    }
}
