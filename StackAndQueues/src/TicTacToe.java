import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        // fill with empty space
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }

        // assign one player X
        char player = 'X';
        boolean gameOver = false;

        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            printBoard(board);
            System.out.println("Player: " + player + " enter: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            // check if the given row and column is empty if so the put the player else print invalid move and let the same player continue
            if (board[row][col] == ' ') {
                board[row][col] = player;
                gameOver = isGameOver(board, player);
                if (gameOver) {
                    System.out.println("Player: " + player + " has won.");
                } else {
                    // flip the player, now
                    player = (player == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move, Try again! ");
            }
        }
        printBoard(board);
    }

    private static boolean isGameOver(char[][] board, char player) {
        // check for each row if same player exists in anyone of the row then return true, gameOver
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }
        // check for each column if same player exists in anyone of the row then return true, gameOver
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }
        // check for both diagonal - diagonal 1
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        // diagonal 2
        if (board[2][0] == player && board[1][1] == player && board[0][2] == player) {
            return true;
        }
        return false;
    }

    private static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
    }
}
