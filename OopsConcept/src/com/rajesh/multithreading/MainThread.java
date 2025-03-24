package com.rajesh.multithreading;

public class MainThread {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println(Thread.currentThread().getName());
        // Getting priority of Main thread
        System.out.println("Main thread priority: "
                + t.getPriority());
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Main thread new priority: "
                + t.getPriority());
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread");
        }

        // create child Thread - annonymous Thread creation

//        Thread ct = new Thread() {
//            public void run() {
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("Child thread Inside main thread");
//                }
//            }
//        };

        Thread ct = new Thread(new ChildThread());

        // Getting priority of child thread
        // which will be inherited from Main thread
        // as it is created by Main thread
        System.out.println("Child thread priority: "
                + ct.getPriority());

        // Setting priority of Main thread to MIN(1)
        ct.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Child thread new priority: "
                + ct.getPriority());

        ct.start();
    }

}

// Class 2
// Helper class extending Thread class
// Child Thread class
class ChildThread extends Thread {


    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {

            // Print statement whenever child thread is
            // called
            System.out.println("Child thread");
        }
    }
}
