package com.nbicocchi.exercises.arrays;

public class _DivideArray {
    public static double[] divideArray(double[] v, double factor)
    {
        double[] b = new double[v.length];
        System.arraycopy(v,0,b,0,v.length);
        for (double item: b)
            item /= factor;

        return b;
    }

}
