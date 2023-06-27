package com.nbicocchi.exercises.exceptions;

public class _CheckLicencePlate {
    public static void checkLicencePlate(String licence)
    {
        if (licence.length() != 7)
            throw new IllegalArgumentException("Licence plate length() != 7");

        //  if no exceptions are thrown --> everything is OK
        isOnlyLetters(licence.substring(0,1));
        isOnlyDigits(licence.substring(2,4));
        isOnlyDigits(licence.substring(5,6));

        System.out.println("Licence plate is valid!");  //  if this executes --> licence plate is OK
    }

    public static void isOnlyDigits(String plate)
    {
        for (char c: plate.toCharArray())
            if (!Character.isDigit(c))
                throw new IllegalArgumentException("Not a digit: "+c);

    }

    public static void isOnlyLetters(String plate)
    {
        for (char c: plate.toCharArray())
            if (!Character.isLetter(c))
                throw new IllegalArgumentException("Not a letter: "+c);

    }
}
