package com.nbicocchi.exercises.exceptions.b;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _ReadLinePartialDelegation {
    public static String readLinePartialDelegation(String filename) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            return bufferedReader.readLine();
        } catch (IOException e)   //  partial delegation -> check exception throw an unchecked options
        {
            throw new RuntimeException();
        }

    }
}
