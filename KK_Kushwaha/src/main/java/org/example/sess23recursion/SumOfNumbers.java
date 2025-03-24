package org.example.sess23recursion;

public class SumOfNumbers {
    public static void main(String[] args) {
//        int ans=sum(12345);
//        System.out.println(ans);

        int ans = product(100);
        System.out.println(ans);
    }


    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;
        return rem + sum(n / 10);
    }

    static int product(int n) {
        // one way
//        if (n == 0) {
//            return 1;
//        }
        // 2nd way - you can check if 1 digit is remaining then return the same digit

        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * product(n / 10);
    }
}
