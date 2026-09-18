package org.example;

import java.util.Random;

public class Contador implements Runnable{

    private String name;
    private int numLaps;

    public Contador(String name, int numLaps) {
        this.name = name;
        this.numLaps = numLaps;
    }

    @Override
    public void run() {
        Random random = new Random();

        for (int i = 0; i <= numLaps; i++) {
            System.out.println("Soy " + name + ", vuelta " + i);

            try {
                int sleepTime = 100 + random.nextInt(400);
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException("Hilo " + name + " interrumpido ", e);
            }
        }
    }


}
