package com.nbicocchi.exercises.exceptions.a;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class _FilterItems {
    public static List<String> filterItems(List<String> strings) {
        List<String> filteredItems = new ArrayList<>();

        try
        {
            for (String item : strings) {
                _CheckString.checkString(item);     //  external function call
                filteredItems.add(item);
            }
        }
        catch (ParseException ignored) {}   //  ignored exception

        return filteredItems;
    }

    /*  Alternative version using Stream    */
    public static List<String> filterItemsWithStreams(List<String> strings) {

        return strings.stream()
                .filter(singleString -> {
                    try
                    {
                        _CheckString.checkString(singleString);
                        return true;
                    } catch (ParseException ignored)    //  ignored exception. Just return false for the stream's sake
                    {
                        return false;
                    }
                }).toList();
    }

}
