import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number to get the multiplication table :: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.printf("%d * %d = %d \n", n, i, n * i);
            i++;
        }
    }
}
