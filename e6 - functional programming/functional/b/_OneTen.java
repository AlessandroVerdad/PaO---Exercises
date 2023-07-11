package com.nbicocchi.exercises.functional.b;

import java.util.List;
import java.util.stream.Collectors;

public class _OneTen {
    public static List<Integer> oneTen(List<Integer> nums) {
        return nums.stream().map(n -> (n + 1) * 10).collect(Collectors.toList());
    }

}
