public class CheckIfArraysSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4};
        //System.out.println(isSortedRec(arr, 0, arr.length - 1));
        System.out.println(isSortedRec1(arr, 0));
    }

//    static boolean isSorted(int[] arr, int st, int end) {
//        // base condition
//        if (st >= end) {
//            return true;
//        }
//        if (arr[end] >= arr[st]) {
//            return isSorted(arr, st + 1, end - 1);
//        } else {
//            return false;
//        }
//    }

    static boolean isSortedRec(int[] arr, int st, int len) {
        // base condition
        if (st == len - 1) {
            return true;
        }
        if (arr[st] <= arr[st + 1]) {
            return isSortedRec(arr, st + 1, len);
        } else {
            return false;
        }
    }

    static boolean isSortedRec1(int[] arr, int index) {
        // base condition
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] <= arr[index + 1] && isSortedRec1(arr, index + 1);
    }
}