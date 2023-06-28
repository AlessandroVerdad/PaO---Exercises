package com.nbicocchi.exercises.exceptions.a;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _ReadLinePartialDelegation {
    public static String readLineNoDelegation(String filename)
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return reader.readLine();
        } catch (IOException e) {
            //  Partial delegation -> unchecked options -> RunTimeExceptions
            throw new RuntimeException();
        }
    }
}
