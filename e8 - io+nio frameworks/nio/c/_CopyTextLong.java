package com.nbicocchi.exercises.nio.c;

import java.io.*;

public class _CopyTextLong {
    public static void copyTextLong(String src, String dst) {
        try (BufferedReader bfr = new BufferedReader(new FileReader(src));
             BufferedWriter bfw = new BufferedWriter(new FileWriter(dst)))
        {
            String line;
            while((line = bfr.readLine()) != null)
                bfw.write(line);

            //  Oppure
            bfr.lines().forEach(
                    readLine -> {
                        try {
                            bfw.write(readLine);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });

        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
