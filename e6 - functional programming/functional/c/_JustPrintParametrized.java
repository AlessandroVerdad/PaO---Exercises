package com.nbicocchi.exercises.functional.c;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _JustPrintParametrized {
    public <T> void justPrintList(List<T> list, Consumer<? super T> consumer) {
        list.forEach(consumer);
    }

    public <K, V> void justPrintMap(Map<K, V> map, BiConsumer<? super K, ? super V> biConsumer) {
        map.forEach(biConsumer);
    }
}
