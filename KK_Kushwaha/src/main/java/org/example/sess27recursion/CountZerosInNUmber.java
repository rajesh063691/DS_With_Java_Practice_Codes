package org.example.sess27recursion;

public class CountZerosInNUmber {

    static int count = 0;

    public static void main(String[] args) {
//        countZeros(302040000);
//        System.out.println(count);

        int ans=countZero(302040,0);
        System.out.println(ans);
    }

    static void countZeros(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        if (rem == 0) {
            count++;
        }
        countZeros(n / 10);
    }

    static int countZero(int n, int count) {
        if (n == 0) {
            return count;
        }

        int rem = n % 10;
        if (rem == 0) {
            return countZero(n / 10, count + 1);
        } else {
            return countZero(n / 10, count);
        }
    }

}
