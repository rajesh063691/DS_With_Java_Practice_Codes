public class MagicNumber {
    public static void main(String[] args) {
        int n = 0;
        int ans = 0;
        int base = 5;
        int originalMagicNumber = n;
        while (n > 0) {
            int last = n & 1;
            ans += base * last;
            base = base * 5;
            // right shift by 1 to eliminate last digit
            n = n >> 1;
        }
        System.out.printf("%dth magic number is: %d\n ", originalMagicNumber, ans);
    }
}
