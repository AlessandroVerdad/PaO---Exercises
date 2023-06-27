package com.nbicocchi.exercises.arrays;

import java.util.Arrays;

public class _BubbleSort {
    public static void bubbleSort(int[] v)
    {
        boolean changed = true;

        for(int i=0; i<v.length && changed; i++)
        {
            changed = false;

            for(int j=0; j<v.length-i-1; j++)
                if (v[j] > v[j+1])
                {
                    changed = true;

                    int temp = v[j];
                    v[j] = v[j+1];
                    v[j+1] = temp;
                }
        }
    }
    public static int[] bubbleSortCopy(int[] v)
    {
        int[] b = Arrays.copyOf(v, v.length);
        bubbleSort(b);

        return b;
    }

}
