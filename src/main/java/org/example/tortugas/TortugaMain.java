package org.example.tortugas;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TortugaMain {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        var executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            executor.submit(new Tortuga("Tortuga-" + i, random));
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println("Carrera terminada");
    }
}
