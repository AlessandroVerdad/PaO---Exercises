package com.nbicocchi.exercises.collections.maps.a;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _ValuesKeys {
    public static boolean valuesKeys(Map<String, String> map) {
        Set<String> keys = map.keySet();
        Set<String> values = new HashSet<>(map.values());

        return values.retainAll(keys);
    }
}
