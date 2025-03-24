import java.util.ArrayList;
import java.util.List;

public class ArrayPermutations {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }


    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        int len = nums.length - 1;
        for (int i = 0; i <= len; i++) {
            ans[i] = nums[i];
            ans[nums.length + i] = nums[i];
        }

        return ans;
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] shuffleArray = new int[2 * n];
        int i = 0;
        int j = 0;
        while (n < nums.length) {
            shuffleArray[j] = nums[i];
            shuffleArray[j + 1] = nums[n];
            i++;
            j += 2;
            n++;
        }
        return shuffleArray;
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = max(candies);
        int totalCandie = 0;
        for (int i = 0; i < candies.length; i++) {
            totalCandie = candies[i] + extraCandies;
            if (totalCandie >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }

        return list;
    }

    private int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    public static int[] createTargetArray(int[] nums, int[] index) {
        int len = nums.length;
        ArrayList<Integer> targetList = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            // Insert nums[i] at index[i] in targetList.
            targetList.add(index[i], nums[i]);
        }
        int[] target = new int[len];
        for (int i = 0; i < len; i++) {
            // Convert ArrayList to integer array.
            target[i] = targetList.get(i);
        }
        return target;
    }


    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        createTargetArray(nums, index);

    }
}
