public class SudokuSolver {
    public static void main(String[] args) {
        int n = 9;
        int[][] board = new int[n][n];

//        int[][] board = {
//                {8, 0, 0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 3, 6, 0, 0, 0, 0, 0},
//                {0, 7, 0, 0, 9, 0, 2, 0, 0},
//                {0, 5, 0, 0, 0, 7, 0, 0, 0},
//                {0, 0, 0, 0, 4, 5, 7, 0, 0},
//                {0, 0, 0, 1, 0, 0, 0, 3, 0},
//                {0, 0, 1, 0, 0, 0, 0, 6, 8},
//                {0, 0, 8, 5, 0, 0, 0, 1, 0},
//                {0, 9, 0, 0, 0, 0, 4, 0, 0}
//        };

//        if (solve(board)) {
//            for (int[] row : board) {
//                for (int item : row) {
//                    System.out.print(item + " ");
//                }
//                System.out.println();
//            }
//        } else {
//            System.out.println("can not be solved");
//        }

        System.out.println(solve(board));
    }

    static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptySpace = true;
        // this is how we are replacing r, c from arguments
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) { // means we found an empty space
                    row = i;
                    col = j;
                    emptySpace = false;
                    break; // we found one empty space. so break it and try to fill this first and then call with recursion
                }
            }

            if (emptySpace == false) { // if we find empty space in the current row then skip the next row for empty space check
                break;
            }
        }
        // if emptySpace==true, means all the cells are filled. so we got the sudoku solved
        if (emptySpace) {
            return true;
        }

        //backtrack
        // call the solve method for all the 1-9 digits
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                // you have found your answer
                if (solve(board)) {
                    display(board);
                    return true;
                } else {
                    // backtrack
                    board[row][col] = 0;
                }
            }
        }
        // sudoku can not be solved
        return false;
    }

    private static void display(int[][] board) {
        for (int[] row : board) {
            for (int item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
        System.out.println("<=========>");
    }

    static boolean isSafe(int[][] board, int row, int col, int num) {
        // check the row
        for (int i = 0; i < board.length; i++) {
            // check if number is present in any of the row
            if (board[i][col] == num) {
                return false;
            }
        }

        // check the column
        for (int j = 0; j < board[0].length; j++) {
            // check if number is present in any of the column
            if (board[row][j] == num) {
                return false;
            }
        }

        // check for individual 3x3 boxes
        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = row - row % sqrt; // modulo to eliminate the already covered 3 columns
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < (rowStart + sqrt); r++) {
            for (int c = colStart; c < (colStart + sqrt); c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }


        return true;
    }
}
