import java.util.Arrays;

public class SortedMatrix {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5, 6, 7, 8},
                {9, 10, 11, 12, 13, 14, 15, 16},
                {17, 18, 19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30, 31, 32},
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16},
        };

        System.out.println(Arrays.toString(search(arr, 33)));
    }

    static int[] binarySearch(int[][] matrix, int row, int stCol, int endCol, int target) {
        while (stCol <= endCol) {
            int mid = stCol + (endCol - stCol) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] > target) {
                endCol = mid - 1;
            } else {
                stCol = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length; // be cautions matrix could be empty.

        // if matrix has only one row then apply simple binary search
        if (row == 1) {
            return binarySearch(matrix, 0, 0, col - 1, target);
        }

        // try reducing the row space until we are left with only 2 rows
        int rStart = 0;
        int rEnd = row - 1;
        int mCol = col / 2;
        while (rStart < (rEnd - 1)) { // utill this is reached , we have more than 2 rows
            int midRow = rStart + (rEnd - rStart) / 2;
            if (matrix[midRow][mCol] == target) {
                return new int[]{midRow, mCol};
            }
            if (matrix[midRow][mCol] > target) {
                rEnd = midRow;
            } else {
                rStart = midRow;
            }
        }
        // now we are left with 2 rows. So, apply Simple Binary Search for 2 rows separately
        int[] ans = {-1, -1};
        // binary search for 1st row
        ans = binarySearch(matrix, rStart, 0, col - 1, target);
        // binary search for 2nd row - check in the 2nd row only if not found in the 1st row
        if (ans[0] == -1 && ans[1] == -1) {
            ans = binarySearch(matrix, rStart + 1, 0, col - 1, target);
        }

        return ans;
    }
}
