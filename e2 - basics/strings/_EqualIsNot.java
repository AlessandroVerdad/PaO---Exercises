package com.nbicocchi.exercises.strings;

public class _EqualIsNot {

    public static boolean equalIsNot(String string)
    {
        return (countMatches(string, "is") > countMatches(string, "not"));
    }

    public static int countMatches(String string, String txt)
    {

        int txtCount = -1;
        int txtIndex = -txt.length();

        do
        {
            txtIndex += txt.length();
            txtCount++;

            txtIndex = string.indexOf(txt, txtIndex);

        }
        while(txtIndex != -1 /*|| txtIndex + txt > string.length()*/);

        return txtCount;
    }
}
