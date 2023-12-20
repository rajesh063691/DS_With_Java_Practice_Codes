public class BinaryOrderAgnostic {
    public static void main(String[] args) {
        int[] barr = {
                //1, 2, 3, 4, 5, 6
                6, 5, 4, 3, 2, 1};

        int target = 1;
        int fIndex = BinSearchIteration(barr, target);
        System.out.printf("Element %d found at index %d", target, fIndex);

    }

    // through iteration approach
    static int BinSearchIteration(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                if (isAsc) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] < target) {
                if (!isAsc) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                return mid;
            }
        }
        return -1;
    }
}
