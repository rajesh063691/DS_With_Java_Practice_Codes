package interview.questions;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOddPrinter {

    private static Object object = new Object();
    private static IntPredicate even = i -> i % 2 == 0;
    private static IntPredicate odd = i -> i % 2 != 0;

    public static void main(String[] args) throws InterruptedException {


        CompletableFuture.runAsync(() -> EvenOddPrinter.printNumber(odd));
        CompletableFuture.runAsync(() -> EvenOddPrinter.printNumber(even));
        Thread.sleep(1000);
    }

    private static void printNumber(IntPredicate predicate) {
        IntStream.rangeClosed(1, 10).filter(predicate).forEach(EvenOddPrinter::execute);
    }


    public static void execute(int no) {
        synchronized (object) {
            try {
                System.out.println(Thread.currentThread().getName() + " :: " + no);
                object.notify();
                object.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
