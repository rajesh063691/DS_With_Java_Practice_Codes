import java.util.Scanner;

public class Fibo {

    public static void main(String[] args) {
        System.out.printf("Fibo Numbers: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        if (n == 0 || n == 1) {
            System.out.printf("Fibonacci of %dth position is %d \n", n, n);
            return;
        }

        int a = 0;
        int b = 1;
        int fibo = 0;
        for (int i = 2; i <= n; i++) {
            fibo = a + b;
            a = b;
            b = fibo;

//           a=b;
//           b=a+b;
        }

        System.out.printf("Fibonacci of %dth position is %d\n", n, fibo);
    }
}
