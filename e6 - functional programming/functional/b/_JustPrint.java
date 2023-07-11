package com.nbicocchi.exercises.functional.b;

import java.util.List;
import java.util.Map;

public class _JustPrint {
    public static <T> void justPrintList(List<T> list) {
        list.forEach(item -> System.out.println("Hello " + item + "!"));
    }

    public static <K, V> void justPrintMap(Map<K, V> map) {
        map.forEach((key, value) -> System.out.println("k: " + key + ", v:" + value));
    }

}
