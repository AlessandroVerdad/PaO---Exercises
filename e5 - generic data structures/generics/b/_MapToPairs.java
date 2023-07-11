package com.nbicocchi.exercises.generics.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class _MapToPairs {

    public static <K, V> List<_Pair<K, V>> mapToPair(Map<K, V> src) {
        List<_Pair<K, V>> retList = new ArrayList<>();

        for (Map.Entry<K, V> entry : src.entrySet()) {
            retList.add(new _Pair<>(entry.getKey(), entry.getValue()));
        }

        return retList;
    }
}
