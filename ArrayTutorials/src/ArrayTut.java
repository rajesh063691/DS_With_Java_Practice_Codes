import java.util.Arrays;
import java.util.Scanner;

public class ArrayTut {
    public static void main(String[] args) {
        //int[] arr = new int[5]; // array of type primitive type int
        String[] str = new String[5]; // array of type Object String
        Scanner sc = new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        for (int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        for (int i =0;i<str.length;i++){
            str[i]=sc.next();
        }

        System.out.println(Arrays.toString(str));


    }
}
