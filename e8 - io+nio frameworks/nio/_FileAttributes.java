package com.nbicocchi.exercises.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _FileAttributes {

    public static boolean exists(String filename) {
        /*
        File newFile = new File(filename);
        return newFile.exists();
        */

        return Files.exists(Paths.get(filename));
    }

    public static boolean isReadable(String filename)
    {
        /*
        Path newPath = Paths.get(filename);
        return Files.isReadable(newPath);
        */

        return Files.isReadable(Paths.get(filename));
    }

    public static boolean isWritable(String filename)
    {
        return Files.isWritable(Paths.get(filename));
    }

    public static boolean isExecutable(String filename)
    {
        return Files.isExecutable(Paths.get(filename));
    }

    public static boolean isRegularFile(String filename)
    {
        return Files.isRegularFile(Paths.get(filename));
    }

    public static boolean isDirectory(String filename)
    {
        return Files.isDirectory(Paths.get(filename));
    }

    public static long size(String filename) throws IOException
    {
       return Files.size(Paths.get(filename));
    }


}
