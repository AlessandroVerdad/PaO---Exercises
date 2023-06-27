package com.nbicocchi.exercises.strings;

public class _GoodAroundTheBeginning {
    public static boolean goodAroundTheBeginning(String string)
    {
        return (string.startsWith("good") || string.startsWith("good", 1));
    }

}
