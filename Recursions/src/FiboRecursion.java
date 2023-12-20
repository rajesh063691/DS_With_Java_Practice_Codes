public class FiboRecursion {
    public static void main(String[] args) {
        int ans = fibonacchi(50);
        System.out.println(ans);
    }

    static int fibonacchi(int n) {
        int ans = 0;

        //base condition
        if (n < 2) {
            return n;
        }

        int a = fibonacchi(n - 1);
        int b = fibonacchi(n - 2);
        ans = a + b;
        return ans;
    }
}
