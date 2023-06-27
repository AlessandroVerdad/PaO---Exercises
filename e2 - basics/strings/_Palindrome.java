package com.nbicocchi.exercises.strings;

public class _Palindrome {
    public static boolean isPalindrome(String string)
    {
        StringBuilder sb = new StringBuilder(string);

        return sb.reverse().toString().equalsIgnoreCase(sb.toString());

    }


}
