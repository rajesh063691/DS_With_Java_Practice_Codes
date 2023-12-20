public class FindPositionInInfiniteArray {
    public static void main(String[] args) {
        // 1. find the start and end of infinite array.
        // 2. once start and end index is found then apply binary search

        int[] arr = {1, 3, 5, 6, 8, 10, 12, 14, 17, 19, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100, 102, 104, 106, 107, 109, 301, 303, 305, 307, 309, 401};
        int key = 10;
        int target = 44;
        int[] index = new int[2];
        // here we got the start and end index
        index = findIndex(arr, key, target);
        // now apply Binary search to find the position
        int pos = search(arr, index[0], index[1], target);
        System.out.printf("Target %d found at index %d \n", target, pos);
    }

    static int[] findIndex(int[] arr, int key, int target) {
        int start = 0;
        int end = key;
        int[] index = {start, end};

        while (start <= end) {
//            if (arr[end] == target) {
//                index[0] = end;
//                index[1] = end;
//                return index;
//            } else if (arr[end] < target) {
//                start = end;
//                end = end + key;
//            } else {
//                index[0] = start;
//                index[1] = end;
//                return index;
//            }
            // basically, we are checking if target lies between start and end if not then for each iteration double the key for broader range
            if (target < arr[end]) {
                index[0] = start;
                index[1] = end;
                return index;
            } else {
                int newStart = end + 1;
                // increasing the size by doubling the search box size
                end = end + (end - start + 1) * 2;
                start=newStart;
            }
        }
        return index;
    }

    static int search(int[] arr, int start, int end, int target) {
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                return ans;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
}
