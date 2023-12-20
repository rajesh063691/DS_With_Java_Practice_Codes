public class DivideArrayInToPieces {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 6, 8, 10, 11, 9, 12};
        int mid = 21;

        System.out.println(numberOfPieces(arr, mid));
    }

    static int numberOfPieces(int[] nums, int target) {
        int sum = 0;
        int pieces = 1;

        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] > target) {
                pieces++;
                sum = nums[i];
            } else {
                sum += nums[i];
            }

        }
        return pieces;
    }
}
