package org.example.sess27recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        int ans=reverse(12345, 0);

        System.out.println(ans);
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
