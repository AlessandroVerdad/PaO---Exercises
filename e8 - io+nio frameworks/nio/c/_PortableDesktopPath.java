package com.nbicocchi.exercises.nio.c;

public class _PortableDesktopPath {
    public static String portableDesktopPath() {
        String desktopFolder = "Desktop";
        String separator = System.getProperty("file separator");
        String home = System.getProperty("user home");

        return String.format("%s%s%s", home, separator, desktopFolder);
    }

}
