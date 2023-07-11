package com.nbicocchi.exercises.collections.lists.c;

import java.util.*;

public class _DownSize {
    public static void downsize(List<String> list, int n)
    {
        int index = 1;
        for (Iterator<String> i = list.iterator(); i.hasNext(); i.next()) {
            if (index++ % n == 0) {
                i.remove();
            }
        }
    }
}
