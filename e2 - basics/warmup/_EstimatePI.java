package com.nbicocchi.exercises.warmup;

import java.util.Random;

public class _EstimatePI {
    public static void main(String[] args) {

        Random random = new Random();

        int tries = 100000;
        int inside = 0;
        int logCount = tries / 4;     //  will have 4 logs

        for (int i = 0; i < tries; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();

            double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));     //  Pitagora

            if (distance <= 1)  //  within the radius
                inside += 1;

            if ((i + 1) % logCount == 0) {  //  (i+1) --> otherwise, it logs also at i = 0
                double estimatedPi = 4 * (double) inside / tries;

                System.out.printf("[trial=%d]", (i + 1));
                System.out.printf("[error=%fpc]", (estimatedPi - Math.PI) / Math.PI);
                System.out.printf("[estimate=%.16f]\n", estimatedPi);
            }


        }


    }
}
