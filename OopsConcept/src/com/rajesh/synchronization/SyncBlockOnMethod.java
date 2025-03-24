package com.rajesh.synchronization;

class PrintNumbers {
    public synchronized void print(int n) {
        // synchronized method
        for (int i = 0; i < 3; i++) {
            System.out.println(n + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SyncBlockOnMethod {
    public static void main(String[] args) {
        PrintNumbers pr = new PrintNumbers();
        Thread t1 = new Thread() {
            public void run() {
                pr.print(15);
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                pr.print(33);
            }
        };

        Thread t3 = new Thread() {
            public void run() {
                pr.print(50);
            }
        };

        Thread t4 = new Thread() {
            public void run() {
                pr.print(60);
            }
        };
        Thread t5 = new Thread() {
            public void run() {
                pr.print(70);
            }
        };
        Thread t6 = new Thread() {
            public void run() {
                pr.print(80);
            }
        };

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }


}
