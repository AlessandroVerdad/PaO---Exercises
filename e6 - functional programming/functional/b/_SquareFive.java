package com.nbicocchi.exercises.functional.b;

import java.util.List;

public class _SquareFive {
    public static long squareFive(List<Integer> nums) {
        return nums.stream().map(n -> n * n + 10).filter(n -> n % 10 != 5).count();
    }

}
