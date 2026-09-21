package org.example.gemini.caracol;

import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CaracolMain {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();

        var num = 3;
        ExecutorService executor = Executors.newFixedThreadPool(num);

        for (int i = 0; i < num; i++) {
            executor.submit(new Caracol("Caracol-" + i, random));
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println("Programa terminado.");
    }
}
