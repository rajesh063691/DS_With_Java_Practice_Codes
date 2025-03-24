package org.example.sess13LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896, 1234};

        System.out.println(countEvenDigit(arr));
    }

    static int countEvenDigit(int[] arr) {
        int evenCount = 0;
        for (int val : arr) {
            if (isEvenDigit(val)) {
                evenCount++;
            }
        }
        return evenCount;
    }

    static boolean isEvenDigit(int n) {
        if (n == 0) {
            return false;
        }
        // check if numbers are negative
        if (n < 0) {
            n = n * -1;
        }

        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count % 2 == 0;
    }
}
