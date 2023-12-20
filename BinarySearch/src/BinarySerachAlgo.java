public class BinarySerachAlgo {
    public static void main(String[] args) {
        int[] barr = {
                1, 2, 3, 4, 5, 6
        };

        int target = 1;
        //int fIndex = BinSearch(barr, 0, barr.length - 1, target);
        int fIndex = BinSearchIteration(barr, target);
        System.out.printf("Element %d found at index %d", target, fIndex);

    }

    // through iteration approach
    static int BinSearchIteration(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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

    // through recursion approach
//    static int BinSearch(int[] arr, int start, int end, int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//        if (start <= end) {
//            int mid = (start + end) / 2;
//            if (arr[mid] == target) {
//                return mid;
//            }
//            if (arr[mid] > target) {
//                end = mid - 1;
//                return BinSearch(arr, start, end, target);
//            } else {
//                start = mid + 1;
//                return BinSearch(arr, start, end, target);
//            }
//        }
//
//        return -1;
//    }
}
