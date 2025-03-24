package com.rajesh.multithreading;

class thread implements Runnable {
    public void run() {
        System.out.println(" got called in thread class");
        try {
            //System.out.println("Currently running Thread ::" + ThreadStates.thread1.getName());
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("State of thread1 while it called join() method on thread2 -" + ThreadStates.thread1.getState() + " and thread name = " + ThreadStates.thread1.getName());

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread2 completes its execution.");
    }
}

public class ThreadStates implements Runnable {
    public static Thread thread1;
    public static ThreadStates obj;

    public static void main(String[] args) {
        obj = new ThreadStates();
        thread1 = new Thread(obj);
        thread1.setName("T1");
        // thread1 created and is currently in the NEW
        // state.
        System.out.println("State of thread1 after creating it - " + thread1.getState());
        thread1.start();
        // thread1 moved to Runnable state
        System.out.println("State of thread1 after calling .start() method on it - " + thread1.getState());
    }


    public void run() {
        System.out.println(" got called in ThreadStates class");
        thread myThread = new thread();
        Thread thread2 = new Thread(myThread);
        thread2.setName("T2");
        System.out.println("State of thread2 after creating it - " + thread2.getState());
        thread2.start();

        System.out.println("State of thread2 after creating it - " + thread2.getState() + " and thread name = " + thread2.getName());
        try {
            // moving thread1 to timed waiting state
            // System.out.println("Currently running Thread ::" + thread1.getName());
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("State of thread2 after calling .sleep() method on it - " + thread2.getState());
        try {
            // waiting for thread2 to die
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("State of thread2 when it has finished it's execution - " + thread2.getState());
        System.out.println("thread1 completes its execution.");
    }
}
