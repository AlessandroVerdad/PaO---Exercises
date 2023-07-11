package com.nbicocchi.exercises.collections.sets.c;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _Intersection {
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second)
    {
        Set<Integer> res = new HashSet<>();

        for (Integer item : first) {
            if (second.contains(item))
                res.add(item);
        }

        return res;
    }
}
