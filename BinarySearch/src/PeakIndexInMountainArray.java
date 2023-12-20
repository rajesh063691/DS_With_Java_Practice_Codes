import java.util.Arrays;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 7, 5, 3, 1,2,4,6,8,15,20,15,13,11,9,7,4};
        int index=peakIndexInMountainArray(arr);
        System.out.printf("Maximum index in array %s is %d and max value is %d \n", Arrays.toString(arr),index,arr[index]);
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
}
