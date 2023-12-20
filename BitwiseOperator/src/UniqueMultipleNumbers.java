public class UniqueMultipleNumbers {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 2, 7, 7, 8, 7, 8, 8};
        System.out.println(findMultipleUnique(arr));

    }

    static int findMultipleUnique(int[] arr) {
        int unique = 0;
        for (int n : arr) {
            unique += n;
        }

        return unique % 3;
    }

}
