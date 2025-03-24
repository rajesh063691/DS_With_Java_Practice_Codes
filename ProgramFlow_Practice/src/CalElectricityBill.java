import java.util.Scanner;

public class CalElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the total unit consumed :: ");
        int unit = sc.nextInt();
        int totalBill = 0;

        if (unit <= 100) {
            totalBill = 10 * unit;
        } else if (unit <= 200) {
            totalBill = (10 * 100) + (unit - 100) * 15;
        } else if (unit <= 300) {
            totalBill = (10 * 100) + (15 * 100) + (unit - 200) * 20;
        } else {
            totalBill = (10 * 100) + (15 * 100) + (20 * 100) + (unit - 300) * 25;
        }


        System.out.printf("Total Bill :: %d\n", totalBill);
    }
}
