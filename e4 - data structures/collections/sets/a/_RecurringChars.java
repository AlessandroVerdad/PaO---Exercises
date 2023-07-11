package com.nbicocchi.exercises.collections.sets.a;

import java.util.HashSet;
import java.util.Set;

public class _RecurringChars {
    public static Set<Character> recurringChars(String string) {
        Set<Character> seenChar = new HashSet<>();
        Set<Character> recurringChar = new HashSet<>();

        for (Character c : string.toCharArray())
            if (!seenChar.contains(c))
                seenChar.add(c);
            else
                recurringChar.add(c);

        return recurringChar;
    }


}
