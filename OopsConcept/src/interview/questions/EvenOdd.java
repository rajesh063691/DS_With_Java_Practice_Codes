package interview.questions;

public class EvenOdd implements Runnable {

    final Object object;
    private static int count = 1;

    public EvenOdd(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        while (count <= 10) {
            if (count % 2 == 0 && Thread.currentThread().getName().equals("even")) {
                synchronized (object) {
                    System.out.println(Thread.currentThread().getName() + " :: " + count);
                    count++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            if (count % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
                synchronized (object) {
                    System.out.println(Thread.currentThread().getName() + " :: " + count);
                    count++;
                    object.notify();
                }
            }
        }
    }


    public static void main(String[] args) {
        Object obj = new Object();
        Thread t1 = new Thread(new EvenOdd(obj),"even");
        Thread t2 = new Thread(new EvenOdd(obj),"odd");
        t1.start();
        t2.start();

    }
}
