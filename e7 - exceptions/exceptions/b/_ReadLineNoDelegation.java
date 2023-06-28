package com.nbicocchi.exercises.exceptions.b;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _ReadLineNoDelegation {
    public static String readLineNoDelegation(String filename) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            return bufferedReader.readLine();
        } catch (IOException e) {
            return null;
        }
    }

}
