package com.nbicocchi.exercises.functional.b;

import java.util.List;
import java.util.stream.Collectors;

public class _NoYYZ {
    public static List<String> noYYZ(List<String> strings) {
        return strings.stream()
                .map(s -> s + "y")
                .filter(s -> !s.contains("yy"))
                .peek(s -> {
                    if (s.startsWith("z"))
                        System.out.println(s);
                })
                .collect(Collectors.toList());
    }
}
