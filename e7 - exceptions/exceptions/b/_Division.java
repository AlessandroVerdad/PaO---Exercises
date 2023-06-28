package com.nbicocchi.exercises.exceptions.b;

public class _Division {
    public static double division(double a, double b) {
        if (b == 0)
            throw new IllegalArgumentException("Divisor must be != 0");
        else
            return a / b;
    }
}
