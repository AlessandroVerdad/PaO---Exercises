package com.nbicocchi.exercises.generics.b;

import java.util.List;

public class _Reverse {

    public static <T> void reverse(List<T> list)
    {
        int size = list.size();

        for (int i = 0; i < size/2; i++) {
            T tmp = list.get(i);

            list.set(i, list.get(size - 1 - i));
            list.set(size - 1 - i, tmp);
        }
    }
}
