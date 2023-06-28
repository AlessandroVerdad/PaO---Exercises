package com.nbicocchi.exercises.exceptions.a;

public class _Division {
    public static double division(double a, double b)
    {
        if (b == 0)
            throw new IllegalArgumentException();
        else return (a/b);
    }

}
