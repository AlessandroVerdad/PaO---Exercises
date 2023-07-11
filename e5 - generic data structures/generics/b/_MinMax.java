package com.nbicocchi.exercises.generics.b;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class _MinMax {

    //  max:    alternative version using Comparator
    public static <T> T cmpMax(List<T> list, Comparator<? super T> cmp) {
        list.sort(cmp);
        return list.get(0);
    }

    //  min:    alternative version using Comparator
    public static <T> T cmpMin(List<T> list, Comparator<? super T> cmp)
    {
        list.sort(cmp.reversed());
        return list.get(0);
    }

    public static <T> T max(List<T> list, Comparator<? super T> cmp) {
        T max = list.get(0);
        for(int i=1; i<list.size(); i++)
            if (cmp.compare(list.get(i), max) > 0)
                max = list.get(i);
        return max;
    }

    public static <T> T min(List<T> list, Comparator<? super T> cmp) {
        T min = list.get(0);
        for(int i=1; i< list.size(); i++)
            if(cmp.compare(min, list.get(i)) > 0)
                min = list.get(i);
        return min;
    }

}
