package interview.questions;

public class PrintFibonacci {

    // using recursion
    public static int printFibonacci(int count) {
        if (count == 0 || count == 1) {
            return count;
        }
        return printFibonacci(count - 1) + printFibonacci(count - 2);
    }

    // normal flow

    public static void printFibo(int n) {
        int a = 0;
        int b = 1;
        int c = 0;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;

            System.out.print(c + " ");

        }
    }

    public static void main(String[] args) {
        //System.out.println(printFibonacci(5));

        for (int i = 0; i < 5; i++) {
            System.out.print(printFibonacci(i) + " ");
        }

        System.out.println("<=======using loop========>");
        printFibo(5);
    }
}
