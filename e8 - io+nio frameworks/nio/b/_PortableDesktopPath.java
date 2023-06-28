package com.nbicocchi.exercises.nio.b;

public class _PortableDesktopPath {
    public static String portableDesktopPath() {
        //return System.getProperty("user.home") + System.getProperty("file separator") + "Desktop";
        String home = System.getProperty("user.home");
        String fSeparator = System.getProperty("file.separator");

        return String.format("%s%s%s", home, fSeparator, "Dekstop");
    }
}
