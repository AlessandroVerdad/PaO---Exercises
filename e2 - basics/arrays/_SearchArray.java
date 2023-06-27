package com.nbicocchi.exercises.arrays;

import java.util.Arrays;

public class _SearchArray {
    public static boolean containsBruteForce(String[] strings, String searched)
    {
        for (String word: strings)
            if (word.equals(searched))
                return true;

        return false;
    }

    public static boolean containsBinary(String[] strings, String searched)
    {
        String[] orderedArray = Arrays.copyOf(strings, strings.length);
        Arrays.sort(orderedArray);

        return Arrays.binarySearch(orderedArray, searched) >= 0;    //  returns negative if the target is not found
    }

}
