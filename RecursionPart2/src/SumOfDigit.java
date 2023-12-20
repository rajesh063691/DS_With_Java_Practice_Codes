public class SumOfDigit {
    public static void main(String[] args) {
        int n = 123450;
        // System.out.println(sumOfDigit(n));
        System.out.println(multiplyOfDigit(n));

    }

    static int sumOfDigit(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumOfDigit(n / 10);
    }

    static int multiplyOfDigit(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * multiplyOfDigit(n / 10);
    }
}
