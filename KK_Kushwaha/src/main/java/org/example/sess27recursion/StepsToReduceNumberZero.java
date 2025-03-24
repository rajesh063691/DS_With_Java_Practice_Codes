package org.example.sess27recursion;

public class StepsToReduceNumberZero {
    public static void main(String[] args) {
        int ans=numberOfSteps(0);
        System.out.println(ans);
    }


    static int numberOfSteps(int n) {
       return helperSteps(n,0);
    }

    static int helperSteps(int n, int steps) {
        if (n == 0) {
            return steps;
        }

        int rem = n % 2;
        if (rem == 0) {
            return helperSteps(n / 2, steps + 1);
        } else {
            return helperSteps(--n, steps + 1);
        }
    }

}
