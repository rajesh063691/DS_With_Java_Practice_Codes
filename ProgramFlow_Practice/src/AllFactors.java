import java.util.Scanner;

public class AllFactors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :: ");
        int n = sc.nextInt();
        int i = 1;
        String factors = "";
        while (i <= n) {
            if (n % i == 0) {
                if (i == 1) {
                    factors = i + "";
                } else {
                    factors = factors + " " + i + " ";
                }

            }
            i++;
        }

        System.out.printf("All the factors of %d is :: %s \n", n, factors);
    }
}
