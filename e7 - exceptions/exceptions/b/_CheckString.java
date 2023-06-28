package com.nbicocchi.exercises.exceptions.b;

import java.text.ParseException;

public class _CheckString {
    public static void checkString(String s) throws ParseException {
        for (int i = 0; i < s.toCharArray().length; i++)
            if (i % 2 == 0 && Character.isDigit(s.charAt(i)))
                throw new ParseException(s, i);
            else if (Character.isLetter(s.charAt(i)))
                throw new ParseException(s, i);
    }
}
