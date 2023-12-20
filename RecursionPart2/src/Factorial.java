public class Factorial {
    public static void main(String[] args) {
        int num = 0;
        System.out.println(factorial(num));
    }


    static int factorial(int n) {
        if (n < 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
