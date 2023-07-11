package com.nbicocchi.exercises.nio.c;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class _CopyBinaryLong {
    public static void copyBinaryLong(String src, String dst) {
        try (FileChannel in = FileChannel.open(Path.of(src),StandardOpenOption.READ);
             FileChannel out = FileChannel.open(Path.of(dst), StandardOpenOption.WRITE))
        {
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            while(in.read(buffer) != -1)
            {
                buffer.flip();
                out.write(buffer);
                buffer.clear();
            }
        }
         catch (IOException e)
         {
             throw new IllegalArgumentException(e);
         }


    }
}
