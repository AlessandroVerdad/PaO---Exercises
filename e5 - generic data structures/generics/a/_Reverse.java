package com.nbicocchi.exercises.generics.a;

import java.util.Collections;
import java.util.List;

public class _Reverse {
    public static <T> void reverse(List<T> list) {
        Collections.reverse(list);
    }
}
