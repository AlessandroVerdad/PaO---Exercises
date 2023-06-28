package com.nbicocchi.exercises.exceptions.a;

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
        int i = 0;  //  counter of tries

        while(i < maxTries)
        {
            try
            {
                write("Hello World");
            }
            catch (IOException e)   //  ignored while i < maxTries
            {
                //  i == maxTries -> error on the last try -> all other times is handled in 'write()'
                //  ('++i' --> i increased every time)
                if(++i == maxTries)
                    throw new RuntimeException("Test failed " + maxTries + " times in a row! --> " + e.getMessage());
            }
        }

    }

    public static void write(String message) throws IOException {
        throw new IOException("Unable to send: " + message);
    }
}
