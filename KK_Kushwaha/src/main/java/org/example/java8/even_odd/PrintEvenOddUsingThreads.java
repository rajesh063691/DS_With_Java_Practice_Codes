package org.example.java8.even_odd;

public class PrintEvenOddUsingThreads implements Runnable {
    private Object obj;
    private static int count = 1;

    public PrintEvenOddUsingThreads(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {

        while (count < 100) {
            if ((Thread.currentThread().getName() == "even") && count % 2 == 0) {
                synchronized (obj) {
                    System.out.println("Thread " + Thread.currentThread().getName() + " :: " + count);
                    count++;
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

            if ((Thread.currentThread().getName() == "odd") && count % 2 != 0) {
                synchronized (obj) {
                    System.out.println("Thread " + Thread.currentThread().getName() + " :: " + count);
                    count++;
                    try {
                        obj.notify();
                    } catch (IllegalMonitorStateException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        }


    }


    public static void main(String[] args) throws Exception {
        PrintEvenOddUsingThreads ref = new PrintEvenOddUsingThreads(new Object());
        Thread evenThread = new Thread(ref, "even");
        Thread oddThread = new Thread(ref, "odd");
        evenThread.start();
        oddThread.start();

        evenThread.join();
        oddThread.join();
    }
}
