package com.nbicocchi.exercises.functional;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class _PayOnAverage {
    public static Map<String, Double> payOnAverage(Map<String, Double> fees) {
        Set<Map.Entry<String, Double>> feeSEntries = fees.entrySet();

        return fees.entrySet().stream()
                .collect(Collectors.groupingBy(
                        entry -> entry.getKey().substring(0, 3),                     //  <K,
                        Collectors.averagingDouble(entry -> entry.getValue())));    //  V>
    }

}
