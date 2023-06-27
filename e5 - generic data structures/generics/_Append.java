package com.nbicocchi.exercises.generics;

import java.util.List;

public class _Append {
    public static <T> void append(List<T> dst, List<T> src) {
        dst.addAll(src);
    }
}
