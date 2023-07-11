package com.nbicocchi.exercises.collections.deque.a;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class _Reverse {
    public static List<String> reverse(List<String> sentence)
    {
        ArrayDeque<String> src = new ArrayDeque<>(sentence);
        List<String> dst = new ArrayList<>();

        while(!src.isEmpty())
            dst.add(src.removeLast());

        src.getFirst();
        src.pollFirst();
        src.peekFirst();
        return dst;
    }

}
