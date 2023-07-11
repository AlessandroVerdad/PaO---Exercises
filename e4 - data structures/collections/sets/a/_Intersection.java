package com.nbicocchi.exercises.collections.sets.a;

import java.util.HashSet;
import java.util.Set;

public class _Intersection {
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> inters = new HashSet<>();

        for (Integer num : first)
            if (second.contains(num))
                inters.add(num);

        return inters;
    }

}
