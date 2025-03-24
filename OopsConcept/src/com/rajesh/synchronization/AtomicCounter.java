package com.rajesh.synchronization;

import java.util.concurrent.atomic.AtomicInteger;

class myThread extends Thread {

    // declaring an atomic variable
    private AtomicInteger count = new AtomicInteger();

    public void run() {
        // calculating the count
        for (int i = 1; i <= 5; i++) {
            try {

                // putting  thread on sleep
                Thread.sleep(i * 100);

                // calling incrementAndGet() method
                // on count variable
                count.incrementAndGet();
            } catch (InterruptedException e) {

                // throwing exception
                System.out.println(e);
            }
        }
    }

    // returning the count value
    public AtomicInteger getCount() {
        return count;
    }
}

public class AtomicCounter {
    // main method
    public static void main(String[] args) throws InterruptedException {
        // creating a thread object
        myThread t = new myThread();
        Thread t1 = new Thread(t, "t1");
        // starting thread t1
        t1.start();
        Thread t2 = new Thread(t, "t2");
        // starting thread t2
        t2.start();
        // calling join method on thread t1
        t1.join();

        // calling join method on thread t1
        t2.join();

        // displaying the count
        System.out.println("count = " + t.getCount());
    }
}
