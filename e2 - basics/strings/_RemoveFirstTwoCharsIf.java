package com.nbicocchi.exercises.strings;

public class _RemoveFirstTwoCharsIf {
    public static String removeFirstTwoCharsIf(String string)
    {
        StringBuilder sb = new StringBuilder();

        if(string.charAt(0) == 'H')
            sb.append(string.charAt(0));
        if(string.charAt(1) == 'e')
            sb.append(string.charAt(1));

        sb.append(string.substring(2));

        return sb.toString();
    }

}
