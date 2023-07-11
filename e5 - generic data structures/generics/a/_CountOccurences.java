package com.nbicocchi.exercises.generics.a;

public class _CountOccurences {
    public static <T> int countOccurrences(T[] src, T item) {
        int count = 0;

        for (T arrayItem : src)
            if (item == null)
                if (arrayItem == null)
                    count++;
                else if (item.equals(arrayItem))
                    count++;

        return count;
    }
}
