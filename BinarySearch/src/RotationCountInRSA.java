public class RotationCountInRSA {
    public static void main(String[] args) {
        //int[] arr = {2, 3, 6, 12, 15, 18};
        int[] arr = {12, 15, 18, 2, 3, 6};
        int noOfRotation = findPeakIndex(arr);

       // int maxEle=Math.max(0,1);

        // if noOfRotation ==-1, means array is not rotated sorted

        System.out.println(noOfRotation + 1);
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
