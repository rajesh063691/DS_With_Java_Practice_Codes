package org.example.sess15binaryin2darray;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50},
        };

        System.out.println(Arrays.toString(searchIn2D(arr, 25)));
    }


    public static int[] searchIn2D(int[][] matrix, int target) {
        int[] ans = {-1, -1};
        if (matrix.length == 0) {
            return ans;
        }
        int row = 0;
        int col = matrix.length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                ans[0] = row;
                ans[1] = col;
                return ans;
            }
            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return ans;
    }


}
