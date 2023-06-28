package com.nbicocchi.exercises.exceptions.b;

import java.text.ParseException;
import java.util.List;

public class _FilterList {
    public static List<List<String>> filterLists(List<List<String>> lists) {
        return lists.stream()
                .filter(list ->     //  single List<String>
                {
                    //  'checkString' on every word of the current List<String>
                    try {
                        for (String s : list)
                            _CheckString.checkString(s);
                        return true;    //  the for loop takes place without throwing an exception --> List<String>
                        // is valid
                    } catch (ParseException e) {
                        return false;
                    }

                })
                .toList();
    }
}
