package com.nbicocchi.exercises.arrays;

import java.util.Arrays;

public class _DeepCopy {
    public static int[][] deepCopy(int[][] original)
    {
        int rows = original.length;
        int[][] b = new int[rows][];

        for(int i=0; i<rows; i++)
        {
            /*  ___METODO 1___  */
            //  'System.arraycopy()' ---> requires the destination array to be allocated manually
            b[i] = new int[rows];
            System.arraycopy(original[i], 0, b[i], 0, rows);

            /*  ___METODO 2___  */
            //  'Arrays.copyOf()' ---> takes care of allocating the destination
            b[i] = Arrays.copyOf(original[i], rows);
        }

        return b;
    }

}
