package com.rajesh.synchronization;


class PrintTest extends Thread {

    // Static synchronization locks the class PrintTest
    synchronized public static void printThread(int n) {

        for (int i = 1; i <= 1; i++) {

            // Print message when threads are executing
            System.out.println("Thread " + n
                    + " is working...");

            // Try block to check for exceptions
            try {

                // making thread to sleep for 0.6 seconds
                Thread.sleep(500);
            }

            // Catch block to handle the exceptions
            catch (Exception ex) {

                // Print message when exception occurs
                System.out.println(ex.toString());
            }
        }

        // Display message for better readability
        System.out.println("--------------------------");

        try {
            Thread.sleep(1000);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}

// Class 2
// Helper class extending Thread class
class Thread1 extends Thread {

    // run() method for thread
    public void run() {

        // Passing the class not the object
        PrintTest.printThread(1);
    }
}

// Class 3
// Helper class extending Thread class
class Thread2 extends Thread {

    public void run() {

        // Passing the class not the object
        PrintTest.printThread(2);
    }
}

class Thread3 extends Thread {

    public void run() {

        // Passing the class not the object
        PrintTest.printThread(3);
    }
}

class Thread4 extends Thread {

    public void run() {

        // Passing the class not the object
        PrintTest.printThread(4);
    }
}

public class SyncBlockOnStatic {
    public static void main(String[] args) {
        // No shared object
        // Creating objects of class 2 and 3 that
        // are extending to Thread class
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        Thread4 t4 = new Thread4();

        // Starting thread with help of start() method
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
