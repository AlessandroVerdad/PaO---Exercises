package com.nbicocchi.exercises.generics.b;

import com.nbicocchi.exercises.generics.Pair;

public class _PairUtil {


    public static <K, V> _Pair<V, K> swap(_Pair<K, V> src)
    {
        return new _Pair<>(src.getSecond(), src.getFirst());
    }
}
