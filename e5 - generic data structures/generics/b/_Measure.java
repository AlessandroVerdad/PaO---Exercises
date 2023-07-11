package com.nbicocchi.exercises.generics.b;

import java.util.Arrays;
import java.util.Comparator;

public class _Measure {
    //  Generic interface
    public interface Measurer <T>{
        double measure(T obj);
    }

    //  max:    Alternative short version using Comparator
    public static <T> T compMax(T[] array, Measurer<T> measurer) {
        Comparator<T> comp = Comparator.comparingDouble(measurer::measure);
        Arrays.sort(array, comp);
        return array[0];
    }

    //  min:    Alternative short version using Comparator
    public static <T> T compMin(T[] array, Measurer<T> measurer) {
        Comparator<T> comp = Comparator.comparingDouble(measurer::measure).reversed();
        Arrays.sort(array, comp);
        return array[0];
    }

    public static <T> T max(T[] array, Measurer<T> measurer) {
        T max = array[0];
        for(T item: array)
            if(measurer.measure(item) > measurer.measure(max))
                max = item;
        return max;
    }
    public static <T> T min(T[] array, Measurer<T> measurer) {
        T min = array[0];
        for(T item: array)
            if(measurer.measure(item) < measurer.measure(min))
                min = item;
        return min;
    }
}

