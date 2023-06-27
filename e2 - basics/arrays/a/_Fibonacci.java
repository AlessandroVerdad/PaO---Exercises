package com.nbicocchi.exercises.arrays;

public class _Fibonacci {
    public static long[] fibonacci(int n) {
        long[] fib = new long[n];

        if (n == 1)
            return new long[]{1};
        else if (n == 2)
            return new long[]{1, 1};

        fib[0] = 1;
        fib[1] = 1;

        for (int i = 2; i < n; i++)
            fib[i] = fib[i - 1] + fib[i - 2];

        return fib;
    }
}
