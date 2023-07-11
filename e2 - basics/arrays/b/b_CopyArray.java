package com.nbicocchi.exercises.arrays.b;

public class b_CopyArray {

    public static double[] copyArray(double[] v)
    {
        double[] b = new double[v.length];
        System.arraycopy(v,0,b,0, v.length);
        return b;
    }
}
