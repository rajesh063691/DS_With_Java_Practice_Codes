public class PrintPatterns {
    public static void main(String[] args) {

        Pattern28(5);
    }

    // TO SOLVE ANY PATTERNS PROBLEM FOLLOW BELOW 3 STEPS
    // STP 1: outer loop will run the number of lines(ROWS) we have
    // STP 2: identify for every row how many columns are there OR types of elements in column
    // STP 3: what do you need to print.

    // pattern 1
    static void Pattern1(int n) {
        // STEP 1
        for (int row = 1; row <= n; row++) {
            // STEP 2
            for (int col = 1; col <= n; col++) {
                // STEP 3
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // pattern 2
    static void Pattern2(int n) {
        // STEP 1
        for (int row = 1; row <= n; row++) {
            // STEP 2
            for (int col = 1; col <= row; col++) {
                // STEP 3
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // pattern 3
    static void Pattern3(int n) {
        // STEP 1
        for (int row = 1; row <= n; row++) {
            // STEP 2
            for (int col = 1; col <= n - row + 1; col++) {
                // STEP 3
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // pattern 4
    static void Pattern4(int n) {
        // STEP 1
        for (int row = 1; row <= n; row++) {
            // STEP 2
            for (int col = 1; col <= row; col++) {
                // STEP 3
                System.out.printf("%d ", col);
            }
            System.out.println();
        }
    }

    // pattern 5
    static void Pattern5(int n) {
        // STEP 1
        for (int row = 1; row <= 2 * n - 1; row++) {
            // STEP 2
            // enhance if loop
            int colLoop = row <= n ? row : (2 * n - row);
//            if (row <= n) {
//                colLoop = row;
//            } else {
//                colLoop = (2 * n - row);
//            }
            for (int col = 1; col <= colLoop; col++) {
                // STEP 3
                System.out.printf("* ");
            }
            System.out.println();
        }
    }

    // pattern 28
    static void Pattern28(int n) {
        // STEP 1
        for (int row = 1; row <= 2 * n - 1; row++) {
            // STEP 2
            // enhance if loop
            int colLoop = row <= n ? row : (2 * n - row);

            int noOfSpaces = n - colLoop;
            for (int k = 1; k < noOfSpaces; k++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= colLoop; col++) {
                // STEP 3
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
