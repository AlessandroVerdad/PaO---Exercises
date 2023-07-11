package com.nbicocchi.exercises.generics.a;

public class _IterableToString {
    public static <E> String iterableToString(Iterable<E> src) {
        StringBuilder res = new StringBuilder();
        for (E item : src)
            res.append(item).append(", ");

        return res.toString();
    }

}
