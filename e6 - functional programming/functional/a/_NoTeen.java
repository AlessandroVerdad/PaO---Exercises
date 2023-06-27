package com.nbicocchi.exercises.functional;

import java.util.List;
import java.util.stream.Collectors;

public class _NoTeen {
    public static List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(w -> w < 13 || w > 19).collect(Collectors.toList());
    }
}
