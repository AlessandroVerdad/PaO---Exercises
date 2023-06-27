package com.nbicocchi.exercises.strings;

public class _Concatenate {

    public static String concatenate(String[] strings) {

        StringBuilder reSb = new StringBuilder();

        for (String word: strings) {
            reSb.append(word);
        }

        return reSb.toString();
    }


}
