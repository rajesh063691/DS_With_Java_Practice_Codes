public class Pallindrom {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(isPallindrom(n));
    }

    static boolean isPallindrom(int n) {
        return n == reverse(n);
    }

    static int reverse(int n) {
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
}
