package com.nbicocchi.exercises.generics;

import java.util.Comparator;
import java.util.List;

public class _MinMax {
    public static <T> T max(List<T> list, Comparator<? super T> cmp) {
        T tmpMax = list.get(0);

        for (T arrayItem : list)
            if (cmp.compare(arrayItem, tmpMax) > 0)
                tmpMax = arrayItem;

        return tmpMax;
    }

    public static <T> T min(List<T> list, Comparator<? super T> cmp) {
        T tmpMin = list.get(0);

        for (T arrayItem : list)
            if (cmp.compare(arrayItem, tmpMin) < 0)
                tmpMin = arrayItem;

        return tmpMin;
    }


}
