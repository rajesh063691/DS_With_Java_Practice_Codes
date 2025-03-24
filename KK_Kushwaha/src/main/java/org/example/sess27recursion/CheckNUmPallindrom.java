package org.example.sess27recursion;

public class CheckNUmPallindrom {
    public static void main(String[] args) {
        boolean ans = isPallindrom(111111);

        System.out.println(ans);
    }

    static boolean isPallindrom(int n) {
        if (n % 10 == n) {
            return true;
        }
        int rev = reverse(n, 0);
        return n == rev;
    }

    static int reverse(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        return reverse(n / 10, sum);
    }
}
