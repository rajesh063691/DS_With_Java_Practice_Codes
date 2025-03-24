import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the numbers till you want to calculate the fibonacci :: ");
        long n = sc.nextLong();
        int i = 3;
        long a = 0;
        long b = 1;
        long fibo = 0;
        System.out.printf("%d %d ", a, b);
        while (i <= n) {
            fibo = a + b;
            a = b;
            b = fibo;
            i++;
            System.out.printf("%d ", fibo);
        }
        System.out.println();
    }
}
