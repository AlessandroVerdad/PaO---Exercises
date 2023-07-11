package com.nbicocchi.exercises.functional.c;

import java.util.Map;
import java.util.stream.Collectors;

public class _PayOnAverage {
    public static Map<String, Double> payOnAverage(Map<String, Double> fees) {
        return fees.entrySet().stream()
                .collect(Collectors.groupingBy(
                        entry -> entry.getKey(),
                        Collectors.averagingDouble(Map.Entry::getValue)
                ));
    }


}
