package com.nbicocchi.exercises.exceptions.c;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _ReadLineCompleteDelegation {
    public static String readLineCompleteDelegation(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return reader.readLine();
        }

    }
}
