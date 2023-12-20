public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        int target=78;
        System.out.println(BS(arr,0,arr.length-1,target));
    }

    static int BS(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return BS(arr, start, mid - 1, target);
        }
        return BS(arr, mid + 1, end, target);
    }
}
