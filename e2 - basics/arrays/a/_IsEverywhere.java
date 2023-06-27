package com.nbicocchi.exercises.arrays;

public class _IsEverywhere {
    public static boolean isEverywhere(int[] v, int value)
    {
        for(int i=0; i<v.length-1; i++)
            if(!(v[i] == value || v[i+1] == value))
                return false;

        return true;
    }

}
