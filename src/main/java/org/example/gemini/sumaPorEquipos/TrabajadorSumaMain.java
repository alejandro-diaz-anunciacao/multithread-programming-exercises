package org.example.gemini.sumaPorEquipos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TrabajadorSumaMain {
    public static void main(String[] args) {
        int num = 2;

        ExecutorService executor = Executors.newFixedThreadPool(num);
        TrabajadorSuma trabajador1 = new TrabajadorSuma(1, 50);
        TrabajadorSuma trabajador2 = new TrabajadorSuma(51, 100);

        executor.submit(trabajador1, trabajador2);

        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
