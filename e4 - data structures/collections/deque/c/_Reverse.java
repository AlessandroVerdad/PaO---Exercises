package com.nbicocchi.exercises.collections.deque.c;

import java.util.*;

public class _Reverse {
    public static List<String> reverse(List<String> sentence)
    {
        ArrayDeque<String> queueStack = new ArrayDeque<String>(sentence);
        List<String> revList = new ArrayList<>();

        while(!queueStack.isEmpty())
        {
            revList.add(queueStack.pollLast());
        }

        return revList;
    }

}
