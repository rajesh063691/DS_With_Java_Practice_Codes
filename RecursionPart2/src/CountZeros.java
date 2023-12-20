public class CountZeros {
    public static void main(String[] args) {
        int n = 12030;
        System.out.println(countZeros(n));
    }

    static int countZeros(int n) {
        int count = 0;
        return helper(n, count);
    }

    private static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 10 == 0) {
            return helper(n / 10, count + 1);
        }
        return helper(n / 10, count);
    }
}
