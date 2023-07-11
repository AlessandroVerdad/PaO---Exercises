package com.nbicocchi.exercises.functional.c;

import java.util.List;

public class _SquareFive {
    public static long squareFive(List<Integer> nums) {
        return nums.stream().map(i -> (i*i) +10).filter(i -> (i-5)%5==0).count();
    }

}
