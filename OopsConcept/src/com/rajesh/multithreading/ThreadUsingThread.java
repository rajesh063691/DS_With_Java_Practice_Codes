package com.rajesh.multithreading;

public class ThreadUsingThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Running thread id: " + Thread.currentThread().getId());
        } catch (Exception e) {
            System.out.println("Caught Exception :: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        int num = 8;
        for (int i = 0; i < 8; i++) {
            ThreadUsingThread obj = new ThreadUsingThread();
            obj.start();
        }
    }
}
