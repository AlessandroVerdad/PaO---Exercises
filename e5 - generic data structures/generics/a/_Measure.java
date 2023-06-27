package com.nbicocchi.exercises.generics;

public class _Measure {
    public static <T> T max(T[] array, Measurer<T> measurer) {
        T tmpMax = array[0];

        for (T arrayItem : array)
            if (measurer.measure(arrayItem) > measurer.measure(tmpMax))
                tmpMax = arrayItem;

        return tmpMax;
    }

    public static <T> T min(T[] array, Measurer<T> measurer) {
        T tmpMax = array[0];

        for (T arrayItem : array)
            if (measurer.measure(arrayItem) < measurer.measure(tmpMax))
                tmpMax = arrayItem;

        return tmpMax;
    }


    public interface Measurer<T> {
        double measure(T obj);
    }


}
