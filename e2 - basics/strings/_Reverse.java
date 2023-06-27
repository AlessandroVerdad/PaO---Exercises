package com.nbicocchi.exercises.strings;

public class _Reverse {
    public static String reverse(String string) {
        StringBuilder sb = new StringBuilder();

        for (int i=string.length()-1; i>=0; i--)
            sb.append(string.charAt(i));

        return sb.toString();
    }

}
