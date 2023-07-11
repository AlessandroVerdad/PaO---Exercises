package com.nbicocchi.exercises.collections.maps.a;

import java.util.*;

public class _WordFrequencySorted extends _WordFrequency {

    public static Map<String, Integer> sortAndCut(Map<String, Integer> map, Comparator<Map.Entry<String, Integer>> comparator, int limit) {
        //  'Map' -> 'List<Map.Entry>'
        List<Map.Entry<String, Integer>> map2List = new ArrayList<>(map.entrySet());

        map2List.sort(comparator);  //  list sort
        map2List = new ArrayList<>(map2List.subList(0, limit));     //  list slice

        //  create a LinkedHashMap --> maintain the insertion order
        Map<String, Integer> res = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : map2List)
            res.put(entry.getKey(), entry.getValue());

        return res;
    }

    public static Map<String, Integer> mostFrequent(Map<String, Integer> map, int limit) {
        return sortAndCut(map, ((e1, e2) -> e2.getValue() - e1.getValue()), limit);
    }

    public static Map<String, Integer> lessFrequent(Map<String, Integer> map, int limit) {
        return sortAndCut(map, ((e1, e2) -> e1.getValue() - e2.getValue()), limit);
    }

}
