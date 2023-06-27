package com.nbicocchi.exercises.arrays;

import java.util.Random;

public class _FillArray {
    public static double[] fillArray(int size, double value, boolean addNoise) {
        double[] v = new double[size];
        Random random = new Random();

        for (double item : v) {
            double adder = 0;

            if (addNoise)
                adder = (random.nextDouble() * 2) - 1;    //  random number between [-1, 1]

            item = value + (double) 5 / 100 * value * adder;
        }
        return v;
    }
}
