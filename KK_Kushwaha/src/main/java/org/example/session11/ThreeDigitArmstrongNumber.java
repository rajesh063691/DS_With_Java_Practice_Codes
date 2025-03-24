package org.example.session11;


// start the loop from >=100 && <999
// create function that returns the sum of cubes
// check with original number if equals then print
public class ThreeDigitArmstrongNumber {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i < 999; i++) {
            sum = sumOfDigitsQubes(i);
            if (sum == i) {
                System.out.println(i);
            }
        }
    }

    public static int sumOfDigitsQubes(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem * rem;
            n = n / 10;
        }
        return sum;
    }
}