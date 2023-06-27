package com.nbicocchi.exercises.generics;

public class _PairUtil {
    public static <K, V> _Pair<V, K> swap(_Pair<K, V> src) {
        return (new _Pair<>(src.getSecond(), src.getFirst()));
    }

}
