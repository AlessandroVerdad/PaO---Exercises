package com.nbicocchi.exercises.exceptions.b;

public class _CheckLicencePlate {
    public static void isOnlyLetters(String string) {
        for (char c : string.toCharArray())
            if (!Character.isLetter(c))
                throw new IllegalArgumentException(c + " is not a letter");
    }

    public static void isOnlyDigits(String string) {
        for (char c : string.toCharArray())
            if (!Character.isDigit(c))
                throw new IllegalArgumentException(c + " is not a digit");

    }

    public static void checkLicencePlate(String licence) {
        isOnlyLetters(licence.substring(0, 2) + licence.substring(5, 7));
        isOnlyDigits(licence.substring(2, 5));

        System.out.println("Licence plate is valid");
    }
}
