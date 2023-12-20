import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter the operator :: ");
            Scanner sc = new Scanner(System.in);
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println();
                if (op == '+') {
                    System.out.println(num1 + num2);
                }
                if (op == '-') {
                    System.out.println(num1 - num2);
                }
                if (op == '*') {
                    System.out.println(num1 * num2);
                }
                if (op == '/') {
                    if (num2 != 0) {
                        System.out.println(num1 / num2);
                    }
                }
                if (op == '%') {
                    if (num2 != 0) {
                        System.out.println(num1 % num2);
                    }
                }
            } else if (op == 'x' || op == 'X') {
                System.out.println("exiting...");
                break;
            } else {
                System.out.println("Invalid input provided.");
            }
        }

    }
}
