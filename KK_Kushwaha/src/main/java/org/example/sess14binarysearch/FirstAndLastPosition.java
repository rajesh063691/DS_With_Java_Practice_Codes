package org.example.sess14binarysearch;

public class FirstAndLastPosition {
    public static void main(String[] args) {

    }

    public static int[] findOccurances(int[] arr, int target) {
        int[] ans = {-1, -1};
        if (arr.length == 0) {
            return ans;
        }

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                // this could b the one potential answer
                ans[0] = mid;
                if (arr[mid - 1] == target) {
                    ans[0] = mid - 1;
                    ans[1] = mid;
                } else {
                    //ans[0] = mid;
                    ans[1] = mid + 1;
                }
                return ans;
            }
        }

        return ans;

    }
}
