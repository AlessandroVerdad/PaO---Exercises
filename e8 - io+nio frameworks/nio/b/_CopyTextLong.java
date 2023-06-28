package com.nbicocchi.exercises.nio.b;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class _CopyTextLong {

    public static void copyTextLong(String src, String dst) {
        try (BufferedReader inBuff = new BufferedReader(Files.newBufferedReader(Paths.get(src)));
             BufferedWriter outBuff = new BufferedWriter(Files.newBufferedWriter(Paths.get(dst)))) {

            inBuff.lines().forEach(line -> {
                try {
                    outBuff.write(line);
                } catch (IOException e) {
                    throw new RuntimeException();
                }

            });

            //  Alternative (buffer)
            /*char[] buffer = new char[1024];

            while (inBuff.read(buffer) != -1)
            {
                outBuff.write(buffer, 0, 1024);
            }*/

            //  Alternative
            /*String line;
            while ((line = inBuff.readLine()) != null) {
                outBuff.write(line);
                outBuff.newLine();
            }*/


        } catch (IOException e)     //  partial delegation
        {
            throw new RuntimeException();
        }
    }

}
