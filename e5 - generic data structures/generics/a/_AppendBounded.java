package com.nbicocchi.exercises.generics;

import java.util.List;

public class _AppendBounded {
    public static <T> void append(List<T> dst, List<? extends T> src) {
        dst.addAll(src);
    }
}
