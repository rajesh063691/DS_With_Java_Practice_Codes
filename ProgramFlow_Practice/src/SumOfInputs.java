import java.util.Objects;
import java.util.Scanner;

public class SumOfInputs {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("enter the numbers to sum else enter x to get the result :: ");
            String input = sc.next();
            if (Objects.equals(input, "x")) {
                break;
            }
            int num = Integer.parseInt(input);
            sum += num;

        }

        System.out.printf("sum :: %d \n", sum);
    }
}
