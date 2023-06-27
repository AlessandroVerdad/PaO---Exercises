package com.nbicocchi.exercises.arrays;

public class _MoveZeroEnd {
    public static int[] moveZerosEnd(int[] v) {
        int[] b = new int[v.length];    //  'b' initialized --> full of 0s
        int j = 0;

        for (int k : v)
            if (k != 0)
                b[j++] = k;

        return b;
    }

}
