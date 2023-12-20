//public class DuplicateNumbers287 {
//    public static void main(String[] args) {
//        int[] arr = {1,1};
//        System.out.println(findDuplicate(arr));
//    }
//
//    static int findDuplicate(int[] nums) {
//        int i = 0;
//        int len = nums.length; // because item should be n+1 bcoz it starts from 0
//        // step 1
//        while (i < len) {
//            int correct = nums[i] - 1;
//            if (nums[i] != nums[correct]) {
//                swap(nums, i, correct);
//            } else {
//                i++;
//            }
//        }
//        // once the numbers are sorted - find the numbers which are not in correct position is the answer
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < len; i++) {
//            if (i!=nums[i]-1){
//                list.add(j + 1);
//            }
//        }
//        return list;
//    }
//
//    static void swap(int[] arr, int first, int second) {
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//
//}
