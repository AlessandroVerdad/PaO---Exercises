package com.nbicocchi.exercises.generics.a;

public class _Divide {
    public static <T extends Number> double divide(T a, T b) {
        return (a.doubleValue() / b.doubleValue());
    }
}
