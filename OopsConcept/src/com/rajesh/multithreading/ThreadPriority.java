package com.rajesh.multithreading;

public class ThreadPriority extends Thread {


    // Method 1
    // run() method for the thread that is called
    // as soon as start() is invoked for thread in main()
    public void run() {
        // Print statement
        System.out.println("Inside run method");
    }

    public static void main(String[] args) {
        System.out.println("Current running Thread ::" + Thread.currentThread().getName() + " and its priority is :: " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("Current running Thread ::" + Thread.currentThread().getName() + " and its priority is :: " + Thread.currentThread().getPriority());

        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();
        ThreadPriority t3 = new ThreadPriority();

        System.out.println("Thread t1 priority :: " + t1.getPriority());
        System.out.println("Thread t2 priority :: " + t2.getPriority());
        System.out.println("Thread t3 priority :: " + t3.getPriority());

        // Setting priorities of above threads by
        // passing integer arguments
        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);

        System.out.println("new Thread t1 priority :: " + t1.getPriority());
        System.out.println("new Thread t2 priority :: " + t2.getPriority());
        System.out.println("new Thread t3 priority :: " + t3.getPriority());


    }
}
