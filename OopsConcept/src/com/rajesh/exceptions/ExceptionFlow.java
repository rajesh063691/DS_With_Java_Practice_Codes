package com.rajesh.exceptions;

public class ExceptionFlow {

    static int divideByZero(int a, int b) {
        // this statement may cause ArithmeticException
        // (/by zero)
        int ans = a / b;
        return ans;
    }


    static int computeDivision(int a, int b) {
        int res = 0;
        try {
            res = divideByZero(a, b);
            System.out.println("statements after try throws as exception");
        } catch (NumberFormatException e) {
            // Display message when exception occurs
            System.out.println(
                    "NumberFormatException is occurred");
        } catch (ArithmeticException e) {
            System.out.println(
                    "ArithmeticException is caught!!! :: " + e.getMessage());
            //throw e;
        }
        System.out.println("message once arithmetic exception is caught");
        return res;
    }


    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            int ans = computeDivision(a, b);
        } catch (ArithmeticException e) {
            // this block will not execite as the same exception has already been caught in the above method
            System.out.println("ArithmeticException is caught!!!" + e.getMessage());
            //e.printStackTrace();
        }
        System.out.println("message once arithmetic exception is caught");
    }
}
