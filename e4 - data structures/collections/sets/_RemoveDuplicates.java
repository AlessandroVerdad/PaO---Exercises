package com.nbicocchi.exercises.collections.sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class _RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> list) {
        //  convert to 'HashSet' to remove duplicates -> convert to List according to declaration
        return new ArrayList<>(new HashSet<>(list));
    }

}
