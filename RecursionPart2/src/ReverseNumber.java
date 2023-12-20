public class ReverseNumber {
    public static void main(String[] args) {
        int n = 12345;
        int rev=reverseDigit(n);
        System.out.println(rev);
        //System.out.println(reverseIterative(n));
        //System.out.println(reverseIterative1(n));
    }

//    static void reverseRecursion1(int n, int rev) {
//        if (n == 0) {
//            return;
//        }
//        int rem = n % 10;
//        rev = rev * 10 + rem;
//        reverseRecursion1(n / 10, rev);
//    }

    static int reverseDigit(int n) {
        int digit = (int) (Math.log10(n)) + 1;
        return helper(n, digit);
    }

    private static int helper(int n, int digit) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return (int) (rem * Math.pow(10, digit - 1)) + helper(n / 10, digit - 1);
    }

    static int reverseIterative(int n) {
        float rev = 0;
        float baseInc = 1;
        while (n > 0) {
            float rem = n % 10;
            baseInc = baseInc * 10;
            rev += (float) (rem / baseInc);
            n = n / 10;
        }
        return (int) (rev * baseInc);
    }

    static int reverseIterative1(int n) {
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev += rem;
            rev *= 10;
            n = n / 10;
        }
        return rev / 10;
    }
}
