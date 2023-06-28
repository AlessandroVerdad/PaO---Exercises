package com.nbicocchi.exercises.exceptions.a;

import java.text.ParseException;

public class _CheckString {
    public static void checkString(String s) throws ParseException  //  ParseException is checked
    {
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0 && !Character.isLetter(s.charAt(i)))
                throw new ParseException(s, i);
            else if (!Character.isDigit(s.charAt(i)))    //  if (i % 2 == 1)
                throw new ParseException(s, i);
        }
    }
}
