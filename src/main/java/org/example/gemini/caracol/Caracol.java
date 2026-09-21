package org.example.gemini.caracol;

import java.util.Random;

public class Caracol implements Runnable{
    private final String name;
    private final Random random;

    public Caracol(String name, Random random) {
        this.name = name;
        this.random = random;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + "ha avanzado " + i + " metros.");
            try {
                Thread.sleep(random.nextInt(500, 1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(name + " ha terminado.");
    }
}
