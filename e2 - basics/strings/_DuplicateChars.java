package com.nbicocchi.exercises.strings;

import java.util.Arrays;

public class _DuplicateChars {


    public static char[] duplicateChars(String string)
    {
        StringBuilder seen = new StringBuilder();
        StringBuilder recurring = new StringBuilder();

        for (int i=0; i<string.length(); i++)
        {
            String iChar = String.valueOf(string.charAt(i));    //  current char converted to String(string[i])

            //  first time seeing this letter
            if (!seen.toString().contains(iChar))
                seen.append(iChar);

            //  'seen' already has it --> check if 'recurring' already has it or not
            else if (!recurring.toString().contains(iChar))
                recurring.append(iChar);
        }

        char[] res = recurring.toString().toCharArray();
        Arrays.sort(res);

        return res;
    }

}
