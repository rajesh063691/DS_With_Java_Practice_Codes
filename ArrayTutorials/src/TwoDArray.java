import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr2D = new int[3][3];
        Scanner sc = new Scanner(System.in);
        // take the input
        for (int row=0;row< arr2D.length;row++){
            for (int col=0;col<arr2D[row].length;col++){
                    arr2D[row][col]=sc.nextInt();
            }
        }

        // print the output
        for (int row=0;row< arr2D.length;row++){
            // one way to print
//            for (int col=0;col<arr2D[row].length;col++){
//                System.out.print(arr2D[row][col]+" ");
//            }
//            System.out.println();
            // another way
            System.out.println(Arrays.toString(arr2D[row]));
        }

        // enhanced for loop
        for (int[] a:arr2D) {
            System.out.println(Arrays.toString(a));
        }

    }
}
