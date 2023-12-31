package com.nbicocchi.exercises.functional.b;

import java.util.List;

public class _AllPalindrome {
    public static boolean allPalindrome(List<String> strings) {
        return strings.stream().allMatch(_AllPalindrome::isPalindrome);
    }

    public static boolean isPalindrome(String string) {
        return string.equals(new StringBuilder(string).reverse().toString());
    }
}
