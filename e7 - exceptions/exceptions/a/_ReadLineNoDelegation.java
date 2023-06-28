package com.nbicocchi.exercises.exceptions.a;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _ReadLineNoDelegation {

    public static String readLineNoDelegation(String filename)
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return reader.readLine();
        }
        //  No delegation -> checked options -> IOException
        catch (IOException e) {
            return null;
        }
    }

}
