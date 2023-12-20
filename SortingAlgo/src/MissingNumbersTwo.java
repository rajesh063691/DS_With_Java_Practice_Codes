//import java.util.Arrays;
//
//public class MissingNumbersTwo {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 4};
//        System.out.println(findDisappearedNumbers(arr));
//    }
//
//    public List<Integer> findDisappearedNumbers(int[] arr) {
//        int i = 0;
//        int len = arr.length;
//        while (i < n) {
//            // check if ith index value is at correct position if yes then increment the ith position
//            // else swap it with the correct position
//            int correct = arr[i] - 1;
//            if (arr[i] != arr[correct]) {
//                // swap ith index value with arr[i]-1 th index
//                swap(arr, i, correct);
//            } else {
//                i++;
//            }
//        }
//
//        List<Integer> list = new ArrayList<>();
//
//        // now array is sorted - iterate over array to check the missing numbers
//        for (int j = 0; j < len; j++) {
//            if (arr[j] != j + 1) {
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
//}
