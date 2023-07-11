package com.nbicocchi.exercises.exceptions.c;

import java.io.IOException;

public class _RetryWrite {
    public class RetryWrite {
        public static void main(String[] args) {
            try {
                writeWithTries(3);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }

        public static void writeWithTries(int maxTries) {
            int i = 0;
            boolean retry = true;

            while (i < 3 && retry) {
                try {
                    write("Hello World!");
                    retry = false;
                } catch (IOException e) {
                    System.out.println("Write failed");
                    retry = true;

                    if (++i == maxTries)
                        throw new RuntimeException("Max number of tries reached!");
                }
            }
        }

        public static void write(String message) throws IOException {
            throw new IOException("Unable to send: " + message);
        }
    }
}
