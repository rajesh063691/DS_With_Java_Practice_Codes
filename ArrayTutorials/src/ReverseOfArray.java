import java.util.Arrays;
import java.util.Scanner;

public class ReverseOfArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        reverse(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }


    static void reverse(int[] a, int start, int end) {
        while (start < end) {
            swap(a,start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] a1, int startIndex, int endIndex) {
        int temp = a1[startIndex];
        a1[startIndex] = a1[endIndex];
        a1[endIndex] = temp;

    }
}
