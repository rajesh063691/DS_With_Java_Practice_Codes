import java.util.Scanner;

public class SwitchTesting {
    public static void main(String[] args) {
        System.out.println("Enter the week days from 1-7 and will say if that is weekday or weekend..");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
//        switch(day){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("WeekDays");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//            default:
//                System.out.println("Invalid input.");
//
//        }

        // enhanced switch statements

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("WeekDays :(");
            case 6, 7 -> System.out.println("Weekend :)");
            default -> System.out.println("Invalid input.");
        }
    }
}
