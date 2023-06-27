package com.nbicocchi.exercises.collections.lists;

import java.util.Iterator;
import java.util.List;

public class _DownSize {
    public static void downsize(List<String> list, int n) {
        int j = 1;
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            iterator.next();
            if (j++ % n == 0)
                iterator.remove();
        }
    }

}
