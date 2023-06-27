package com.nbicocchi.exercises.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class _MapToPairs {
    public static <K, V> List<_Pair<K, V>> mapTo_Pairs(Map<K, V> src) {
        List<_Pair<K, V>> dstPairList = new ArrayList<>();
        for (Map.Entry<K, V> singleEntry : src.entrySet()) {
            //  convert entry from 'map' to a '_Pair' object
            _Pair<K, V> entry2Pair = new _Pair<>(singleEntry.getKey(), singleEntry.getValue());
            dstPairList.add(entry2Pair);
        }

        return dstPairList;
    }


}
