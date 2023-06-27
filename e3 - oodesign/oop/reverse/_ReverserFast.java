package com.nbicocchi.exercises.oop.reverse;

public class _ReverserFast implements Reverser {
    @Override
    public String reverse(String s) {
        return (new StringBuilder(s).reverse().toString());
    }
}
