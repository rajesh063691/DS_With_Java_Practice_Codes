import java.util.Arrays;

public class TwoStackGames {
    public static int twoStack(int[] a, int[] b, int maxSum) {
        return twoStackHelper(maxSum, a, b, 0, 0) - 1;
    }

    private static int twoStackHelper(int maxSum, int[] a, int[] b, int sum, int count) {
        if (sum > maxSum) {
            return count;
        }

        if (a.length == 0 || b.length == 0) {
            return count;
        }

        int step1 = twoStackHelper(maxSum, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
        int step2 = twoStackHelper(maxSum, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1);

        return Math.max(step1, step2);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9};
        int maxSum = 10;
        System.out.println(twoStack(a, b, maxSum));
    }
}
