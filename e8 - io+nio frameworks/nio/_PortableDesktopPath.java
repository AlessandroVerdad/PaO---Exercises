package com.nbicocchi.exercises.nio;

public class _PortableDesktopPath {
    public static String portableDesktopPath()
    {
        String fileSeparator = System.getProperty("file.separator");
        String userHome = System.getProperty("user.home");

        return String.format("%s%s%s", userHome , fileSeparator , "Desktop");
    }
}
