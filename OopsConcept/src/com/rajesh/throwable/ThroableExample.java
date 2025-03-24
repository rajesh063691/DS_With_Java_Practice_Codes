package com.rajesh.throwable;

public class ThroableExample {
    public static void main(String[] args) throws Exception {
        try {
            testException();
        } catch (Throwable e) {
            System.out.println("Exception String :: " + e.toString());
            System.out.println("Exception Message:: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Method which throws Exception
    public static void testException() throws Exception {
        throw new Exception("throw new exception.");
    }
}
