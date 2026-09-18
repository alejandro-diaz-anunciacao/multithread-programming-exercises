package org.example;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 5; i++) {
            executor.submit(new Contador( "Contador-"+ i, 5));
        }

        executor.awaitTermination(10, TimeUnit.MINUTES);
    }
}