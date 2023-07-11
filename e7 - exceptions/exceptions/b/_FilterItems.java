package com.nbicocchi.exercises.exceptions.b;

import com.nbicocchi.exercises.exceptions.a._CheckString;

import java.text.ParseException;
import java.util.List;

public class _FilterItems {

    public static List<String> filterItems(List<String> strings) {
        return strings.stream().filter(s -> {
            try {
                _CheckString.checkString(s);
                return true;
            } catch (ParseException e) {
                System.out.println("Error in string parsing");
                return false;
            }
        }).toList();
    }
}
