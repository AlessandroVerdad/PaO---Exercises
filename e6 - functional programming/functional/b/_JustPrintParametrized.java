package com.nbicocchi.exercises.functional.b;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _JustPrintParametrized {
    public static <T> void justPrintList(List<T> list, Consumer<? super T> outTemplate) {
        list.forEach(outTemplate);
    }

    public static <K, V> void justPrintMap(Map<K, V> map, BiConsumer<? super K, ? super V> biTemplate) {
        map.forEach(biTemplate);
    }

}
