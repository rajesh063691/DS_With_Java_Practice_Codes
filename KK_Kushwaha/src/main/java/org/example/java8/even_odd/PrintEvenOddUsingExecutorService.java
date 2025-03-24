package org.example.java8.even_odd;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class PrintEvenOddUsingExecutorService {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        IntStream.rangeClosed(1, 10).
                forEach(
                        num ->
                        {
                            CompletableFuture<Integer> oddComputableFuture = CompletableFuture.completedFuture(num)
                                    .thenApplyAsync(
                                            x -> {
                                                if (x % 2 != 0) {
                                                    System.out.println("Thread " + Thread.currentThread().getName() + " :" + x);
                                                }
                                                return num;
                                            }, executorService);
                            oddComputableFuture.join();

                            CompletableFuture<Integer> evenComputableFuture = CompletableFuture.completedFuture(num)
                                    .thenApplyAsync(
                                            x -> {
                                                if (x % 2 == 0) {
                                                    System.out.println("Thread " + Thread.currentThread().getName() + " :" + x);
                                                }
                                                return num;
                                            }, executorService);
                            evenComputableFuture.join();
                        }
                );

        executorService.shutdown();
    }
}
