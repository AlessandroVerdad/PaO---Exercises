package com.nbicocchi.exercises.functional.c;

import java.util.List;

public class _NoYYZ {
    public static List<String> noYYZ(List<String> strings) {
        return strings.stream()
                .map(s -> s + "y")
                .filter(s -> !s.contains("yy"))
                .peek(i -> {
                    if (i.startsWith("z"))
                        System.out.println(i);
                })
                .toList();

    }
}
