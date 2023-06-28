package com.nbicocchi.exercises.nio.a;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _CopyTextLong {
    public static void copyTextLong(String src, String dst) throws IOException {
        Path srcPath = Paths.get(src);
        Path dstPath = Paths.get(dst);

        try (BufferedReader inBufferedReader = Files.newBufferedReader(srcPath);    //  open buffers
             BufferedWriter outBufferedWriter = Files.newBufferedWriter(dstPath))
        {
            //  BufferedReader.lines() -> create a stream of lines from source file
            inBufferedReader.lines().forEach(line ->    //  iteration of every line of the file
            {
                try
                {
                    outBufferedWriter.write(line);
                }
                catch (IOException e)
                {
                    throw new RuntimeException();
                }
            });
        }
    }

}
