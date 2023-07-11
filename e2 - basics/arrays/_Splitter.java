package com.nbicocchi.exercises.arrays;

import java.lang.Math;

public class _Splitter {
    public static int[] splitter(int input)
    {
        String stringNumber = Integer.toString(input);
        int[] res = new int[stringNumber.length()];

        for(int i=0; i<stringNumber.length(); i++)
            res[i] = stringNumber.charAt(i);
            //res[i] = Character.getNumericValue(stringNumber.charAt(i));

        return res;
    }


}
