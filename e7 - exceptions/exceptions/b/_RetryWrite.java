package com.nbicocchi.exercises.exceptions.b;

import java.io.IOException;

public class _RetryWrite {

    public static void main(String[] args) {
        try {
            writeWithTries(3);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeWithTries(int maxTries) {
        int i = 0;
        while (i < maxTries) {
            try {
                write("Hello World!");
            }
            catch (IOException e) {
                if (++i == 3)
                    throw new RuntimeException("Test failed " + maxTries + " times in a row! --> " + e.getMessage());
            }
        }
        /*
        Only reason why the throw can't be put outside the try-catch: 'e.getMessage()' would get lost (as 'e'
        lives inside the try-catch block)
        */
        //  throw new RuntimeException("Test failed " + maxTries + " times in a row! --> " + e.getMessage());
    }

    public static void write(String message) throws IOException {
        throw new IOException("Unable to send: " + message);
    }

}
