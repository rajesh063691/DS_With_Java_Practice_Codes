import java.util.ArrayList;

public class SearchInArrayRecursion {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 18, 19};
        int target = 18;
//        System.out.println(searchIndex(arr, target, 0));
//        System.out.println(search(arr, target, 0));
//        System.out.println(searchIndexLast(arr, target, arr.length - 1));
        System.out.println(searchIndexAll1(arr, target, 0));
    }

    static boolean search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || search(arr, target, index + 1);
    }

    static int searchIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return searchIndex(arr, target, index + 1);
        }
    }

    static int searchIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return searchIndexLast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> searchIndexAll(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return searchIndexAll(arr, target, index + 1, list);
    }

    // do not pass the list object in argument rather create in the function body itself.
    static ArrayList<Integer> searchIndexAll1(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        // this will contain answer for each individual function call.
        ArrayList<Integer> ansForEachCall = searchIndexAll1(arr, target, index + 1);
        //add all incoming list values in the list object and return that list
        list.addAll(ansForEachCall);
        return list;
    }
}
