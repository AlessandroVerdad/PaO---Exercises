package com.nbicocchi.exercises.functional.c;

import java.util.List;
import java.util.Map;

public class _JustPrint {
    public static <T> void justPrintList(List<T> list) {
        list.forEach(i -> System.out.println("Hello "+i+"!"));
    }
    public static <K,V> void justPrintMap(Map<K, V> map) {
        map.forEach(((k, v) -> System.out.println("k:"+k+", v:"+v)));
    }
}
