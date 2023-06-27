package com.nbicocchi.exercises.arrays;

public class _CanBalance {
    public static boolean canBalance(int[] v)
    {
        for(int i=1; i<v.length-1; i++)
            if (subSum(0, i, v) == subSum(i+1, v.length-1, v))
                return true;

        return false;
    }

    public static int subSum(int start, int end, int[] a)
    {
        int res = 0;
        for (int i=start; i<=end; i++)
            res += a[i];
        return res;
    }

}
