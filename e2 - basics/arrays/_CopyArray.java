package com.nbicocchi.exercises.arrays;

public class _CopyArray {
    public static double[] copyArray(double[] v)
    {
        double[] b = new double[v.length];
        System.arraycopy(v,0,b,0,v.length);
        return b;
    }
}
