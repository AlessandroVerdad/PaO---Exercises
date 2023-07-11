package com.nbicocchi.exercises.collections.maps.a;

import java.util.HashMap;
import java.util.Map;

public class _InvertMap {
    public static Map<String, Integer> invertMap(Map<Integer, String> src) {
        Map<String, Integer> invertedMap = new HashMap<>();

        for (Map.Entry<Integer, String> entry : src.entrySet())
            invertedMap.put(entry.getValue(), entry.getKey());

        return invertedMap;
    }
}
