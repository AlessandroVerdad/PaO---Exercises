package com.nbicocchi.exercises.nio.b;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class _CopyBinaryLong {
    public static void copyBinaryLong(String src, String dst) {

        try (FileChannel inCh = FileChannel.open(Paths.get(src), StandardOpenOption.READ);
             FileChannel outCh = FileChannel.open(Paths.get(dst), StandardOpenOption.CREATE)) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            while (inCh.read(buffer) != -1) {
                buffer.flip();  //  now 'buffer' will be used to write
                outCh.write(buffer);
                buffer.clear(); //  prepare to use it to 'read'
            }
        } catch (IOException e) {
            throw new RuntimeException();   //  partial delegation
        }
    }
}
