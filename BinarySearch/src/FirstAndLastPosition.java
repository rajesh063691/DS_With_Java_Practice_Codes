import java.util.Arrays;

public class FirstAndLastPosition {

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8};
        int target = 7;
        int[] tarray = new int[2];
        tarray = searchRange(arr, target);
        System.out.printf("start and last index of %d is %s \n", target, Arrays.toString(tarray));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0]= search(nums, target, true);
        if (ans[0]!=-1){
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    static int search(int[] nums, int target, boolean isLookingLeft) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                //this could be the potential ans
                ans = mid;
                if (isLookingLeft) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

}
