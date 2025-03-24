package org.example.java8.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureObj {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture=new CompletableFuture<>();
        String s = completableFuture.get();
        completableFuture.complete("Rajesh");
        System.out.println(s);

    }
}
