package com.nbicocchi.exercises.functional.b;

import java.util.List;
import java.util.stream.Collectors;

public class _TwoTwo {
    public static List<Integer> twoTwo(List<Integer> nums) {
        return nums.stream().map(n -> n * 2).filter(w -> (w - 2) % 10 != 0).collect(Collectors.toList());
    }

}
