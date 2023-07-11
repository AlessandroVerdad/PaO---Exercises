package com.nbicocchi.exercises.functional.c;

import java.util.Map;

public class _PayMore {

    public static void payMore(Map<String, Double> fees, String numberFamily, double costDelta)
    {
        fees.replaceAll((k,v)->{
            if(k.startsWith(numberFamily))
                v += costDelta;
            return v;
        });
    }
}
