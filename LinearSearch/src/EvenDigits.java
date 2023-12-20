import java.util.Arrays;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = new int[]{100, 20, 130, 440, 660, 7, 70};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isEvenDigit(arr[i])) {
                count++;
            }
        }
        System.out.printf("Total nos of even digits = %d  in array %s\n", count, Arrays.toString(arr));
    }

    static boolean isEvenDigit(int item) {
        return noOfDigit(item) % 2 == 0;
    }

    static int noOfDigit(int num) {
        // check if number is 0
        if (num == 0) {
            return 1;
        }
        // check if numbers are negative
        if (num < 0) {
            num = num * -1;
        }
        int digitCount = 0;
        while (num > 0) {
            digitCount++;
            num = num / 10;
        }
        return digitCount;
    }
}
