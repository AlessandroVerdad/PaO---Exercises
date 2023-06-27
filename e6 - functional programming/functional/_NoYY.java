package com.nbicocchi.exercises.functional;

import java.util.List;
import java.util.stream.Collectors;

public class _NoYY {
    public static List<String> noYY(List<String> strings) {
        return strings.stream().map(s -> s += "Y").filter(s -> !s.contains("yy")).collect(Collectors.toList());
        //return strings.stream().map(s -> s = (new StringBuilder(s).append("Y").toString())).filter(s -> s.contains("yy")).collect(Collectors.toList());
    }

}
