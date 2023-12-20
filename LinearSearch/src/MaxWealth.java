public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1},
                {2, 7, 9},
        };

        int richest = 0;

        for (int row = 0; row < accounts.length; row++) {
            int rich = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                rich = rich + accounts[row][col];
            }
            if (rich > richest) {
                richest = rich;
            }
        }

        System.out.printf("Richest = %d \n", richest);
    }
}
