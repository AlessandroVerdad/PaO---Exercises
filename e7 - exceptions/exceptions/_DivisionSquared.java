package com.nbicocchi.exercises.exceptions;

public class _DivisionSquared {
    public static int divisionSquared(int a, int b)
    {
        try
        {
            return (a/b)*(a/b);
        }
        catch (ArithmeticException e) {
            return 0;
        }
    }
}
