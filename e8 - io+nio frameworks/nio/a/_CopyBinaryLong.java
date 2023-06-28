package com.nbicocchi.exercises.nio.a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class _CopyBinaryLong {
    public static void copyTextLong(String src, String dst)
    {
        Path srcPath = Paths.get(src);
        Path dstPath = Paths.get(dst);

        try (FileChannel inChannelFile = FileChannel.open(srcPath, StandardOpenOption.READ);    //  open files' channels
        FileChannel outChannelFile = FileChannel.open(srcPath, StandardOpenOption.CREATE))
        {
            ByteBuffer writeBuffer = ByteBuffer.allocate(1024); //  writing element

            while (inChannelFile.read(writeBuffer) != -1)
            {
                writeBuffer.flip(); //  buffer preparation
                outChannelFile.write(writeBuffer);
                writeBuffer.clear();
            }
        }
        catch (IOException e)   //  checked
        {
            throw new RuntimeException();
        }
    }
}
