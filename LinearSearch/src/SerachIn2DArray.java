import java.util.Arrays;
import java.util.Scanner;

public class SerachIn2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {10, 20, 30, 40},
                {1, 2, 3, 5, 6, 7, 8},
                {50, 60, 70}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements to search :: ");
        int item = sc.nextInt();
        int[] find = SearchItemIn2D(arr, item);
        if (find[0] == -1 && find[1] == -1) {
            System.out.printf("Item ::%d:: not found.", item);
            return;
        }
        System.out.printf("Item ::%d::Found at row %d at index %d", item, find[0], find[1]);
    }

    static int[] SearchItemIn2D(int[][] arr, int search) {
        int[] found = new int[]{-1, -1};
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                {
                    if (arr[row][col] == search) {
                        found[0] = row;
                        found[1] = col;
                        return found;
                    }
                }
            }
        }
        return found;
    }
}
