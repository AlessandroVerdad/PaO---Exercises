package com.nbicocchi.exercises.strings;

public class _SumDigits {
    public static int sumDigits(String string)
    {
        int sum = 0;

        for(int i=0; i<string.length(); i++)
        {
            if (Character.isLetter(string.charAt(i)))
                sum += Character.getNumericValue(string.charAt(i));
        }

        return sum;
    }


}
