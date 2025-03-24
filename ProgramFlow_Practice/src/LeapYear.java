import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter year :: ");
        int year = sc.nextInt();
        boolean leap = isLeapYear(year);
        System.out.printf("year %d is a leap year :: %b",year, leap);
    }

    private static boolean isLeapYear(int year) {
        // number should be divisible by 4 but should not be century year || if century then should be divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//            leapYear = true;
//        }
        // return leapYear;
    }

}
