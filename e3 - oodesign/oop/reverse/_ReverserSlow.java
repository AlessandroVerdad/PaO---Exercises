package com.nbicocchi.exercises.oop.reverse;

public class _ReverserSlow implements Reverser{
    @Override
    public String reverse(String s) {
        int length = s.length();
        char[] revString = new char[length];

        for(int i=0; i<length; i++)
            revString[i] = s.charAt(length-i-1);

        return String.valueOf(revString);
    }
}
