public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(Queens(n));
    }

    static int Queens(int n) {
        boolean[][] board = new boolean[n][n];
        return queensPlacement(board, 0);
    }

    static int queensPlacement(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            return 1;
        }

        int count = 0;

        for (int col = 0; col < board.length; col++) {
            // place it if its safe
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count = count + queensPlacement(board, row + 1);
                board[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // for vertical down
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        // for left incline
        int leftMax = Math.min(row, col);
        for (int i = 1; i <= leftMax; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // for right incline
        int rightMax = Math.min(row, board.length - 1 - col);
        for (int i = 1; i <= rightMax; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
