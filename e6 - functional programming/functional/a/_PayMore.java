package com.nbicocchi.exercises.functional;

import java.util.Map;

public class _PayMore {
    public static void payMore(Map<String, Double> fees, String numberFamily, double costDelta) {
        /*  Metodo lungo
        fees.replaceAll((k, v) -> {
            if (k.startsWith(numberFamily))
                return v + costDelta;
            else
                return v;
        });
         */

        //  Single line version
        fees.replaceAll((k, v) -> k.startsWith(numberFamily) ? (v + costDelta) : v);
    }


}
