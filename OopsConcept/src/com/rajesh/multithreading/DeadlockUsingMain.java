package com.rajesh.multithreading;

public class DeadlockUsingMain {
    public static void main(String[] args) {
        try {
            System.out.println("entering into deadlock");
            Thread.currentThread().join();
            System.out.println("this statement will never execute.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}