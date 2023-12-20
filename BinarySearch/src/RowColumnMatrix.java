import java.util.Arrays;

public class RowColumnMatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,30,32},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50},
        };

        int target=35;
        System.out.println(Arrays.toString(search(matrix,target)));
    }



    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        int[] retArray = {-1, -1};
        int length =matrix.length;

        while (row <length && col >= 0) {
            // case 1: if target matches with 1st element
            if (target == matrix[row][col]) {
                retArray[0] = row;
                retArray[1] = col;
                return retArray;
            }
            // case 2: if target > current position => increase row by 1
            if (target > matrix[row][col]) {
                row++;
            }else{
                // case 3: if target < current position => decrease col by 1
                col--;
            }


        }
        return retArray;
    }
}
