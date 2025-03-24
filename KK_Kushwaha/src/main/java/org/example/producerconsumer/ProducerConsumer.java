package org.example.producerconsumer;

import java.util.LinkedList;

class PC {
    private static LinkedList<Integer> list = new LinkedList<>();
    private int capacity = 5;

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                if (list.size() == capacity) {
                    wait();
                }
                System.out.println("produced :: " + value);
                list.add(value);
                value++;
                notify();
                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                if (list.isEmpty()) {
                    wait();
                }
                int val = list.removeFirst();
                System.out.println("consumed :: " + val);
                notify();
                Thread.sleep(1000);
            }
        }
    }
}


public class ProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        PC pc = new PC();
        Thread t1 = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });

        Thread t2 = new Thread(() -> {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();

        // wait to complete
        t1.join();
        t2.join();
    }
}
