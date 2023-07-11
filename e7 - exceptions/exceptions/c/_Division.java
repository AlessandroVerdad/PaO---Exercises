package com.nbicocchi.exercises.exceptions.c;

public class _Division {
    public static double division(double a, double b) {
        if (b == 0)
            throw new IllegalArgumentException("Divisor must != 0");   //  unchecked
        return a / b;
    }
}
