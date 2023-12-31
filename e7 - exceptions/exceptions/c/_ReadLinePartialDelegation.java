package com.nbicocchi.exercises.exceptions.c;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _ReadLinePartialDelegation {
    public static String readLinePartialDelegation(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException("Error in file IO");
        }
    }
}
