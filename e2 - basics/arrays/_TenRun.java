package com.nbicocchi.exercises.arrays;

public class _TenRun {
    public static int[] tenRun(int[] v) {
        int[] b = new int[v.length];
        boolean foundMultiple = false;
        int currentMultiple = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] % 10 == 0) {
                currentMultiple = v[i];
                foundMultiple = true;   //  first multiple of 10 found
            }

            /*
            if (foundMultiple)
                b[i] = currentMultiple;
            else
                b[i] = v[i];

            ...OPPURE...
            */

            b[i] = foundMultiple ? currentMultiple : v[i];
        }

        return b;
    }

}
