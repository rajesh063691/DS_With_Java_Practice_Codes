public class NumberOfSetBits {
    public static void main(String[] args) {
        int n = 6;
        int setBitsCount = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                setBitsCount++;
            }
            n = n >> 1;
        }

        System.out.println(setBitsCount);
    }
}
