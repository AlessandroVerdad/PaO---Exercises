package com.nbicocchi.exercises.strings;

public class _RemoveFirstLast {
    public static String removeFirstLast(String string){
        if (string.charAt(0) == string.charAt(string.length()-1))
            return string;
        else
            return string.substring(1, string.length()-2);
    }

}
