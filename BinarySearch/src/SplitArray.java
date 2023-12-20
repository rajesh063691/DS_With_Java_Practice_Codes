public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        int key = 2;

        System.out.println(splitArray(arr, key));
    }

    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        while (start < end) {

            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;

            for (int i = 0; i < nums.length; i++) {
                if (sum + nums[i] > mid) {
                    pieces++;
                    sum = nums[i];
                } else {
                    sum += nums[i];
                }
            }

            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end; // here start==end
    }
}
