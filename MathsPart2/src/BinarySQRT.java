public class BinarySQRT {
    public static void main(String[] args) {
        int n = 60;
        int p = 3;
        System.out.printf("Sqrt of %d is %.3f", n, sqrt(n, 3));

    }

    // O(log(n))
    static double sqrt(int n, int p) {
        int start = 0;
        int end = n;
        double root = 0.0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == n) {
                return mid;
            }
            if (mid * mid > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        double incr = 0.1;
        // at this stage start will be 1 more than end. so take end and add in the root
        root = root + end;

        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }
            root -= incr;

            incr = incr / 10;
        }
        return root;
    }
}
