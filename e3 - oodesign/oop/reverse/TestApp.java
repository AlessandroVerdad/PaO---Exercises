package com.nbicocchi.exercises.oop.reverse;

public class TestApp {
    public static void main(String[] args) {
        Reverser r = s -> new StringBuilder(s).reverse().toString();
        System.out.println(r.reverse("Hello World!"));
    }
}
