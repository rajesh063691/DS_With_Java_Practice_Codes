import java.util.ArrayList;
import java.util.Arrays;

public class FactorOfNumber {
    public static void main(String[] args) {
        int number = 50;
        System.out.printf("Factors of %d is :: ", number);
        factors3(number);


    }

    static void factors1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.printf(i + " ");
            }
        }
    }

    static void factors2(int n) {
        // run till sqrt of that number only
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.printf(i + " ");
                } else {
                    System.out.printf(i + " " + n / i + " ");
                }

            }
        }

    }

    // print in sorted order
    static void factors3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        // run till sqrt of that number only
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.printf(i + " ");
                } else {
                    System.out.printf(i + " ");
                    list.add(n / i);
                }

            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }

    }
}
