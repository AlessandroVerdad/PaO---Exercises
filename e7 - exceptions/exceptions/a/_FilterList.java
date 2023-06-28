package com.nbicocchi.exercises.exceptions.a;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class _FilterList {
    public static List<List<String>> filterLists(List<List<String>> lists) {
        List<List<String>> res = new ArrayList<>();

        for (List<String> singleList : lists)
        {
            try
            {
                //  if the whole for takes place without raising an exception --> ALL strings are OK --> the whole list can be added
                for (String singleString : singleList) {
                    _CheckString.checkString(singleString);
                }
                res.add(singleList);

            } catch (ParseException ignored) {} //  ignored exception
        }

        return res;
    }

}
