package com.nbicocchi.exercises.exceptions.c;

public class _CheckLicencePlate {
    public static boolean isOnlyLetters(String string) {
        for (char c : string.toCharArray()) {
            if (Character.isDigit(c))
                throw new IllegalArgumentException();
        }
        return true;
    }

    public static boolean isOnlyDigits(String string) {
        for (char c : string.toCharArray()) {
            if (Character.isLetter(c))
                throw new IllegalArgumentException();
        }
        return true;
    }


    public static void checkLicencePlate(String licence) {
        isOnlyLetters(licence.substring(0, 2) + licence.substring(5, 7));
        isOnlyDigits(licence.substring(2, 5));
    }
}
