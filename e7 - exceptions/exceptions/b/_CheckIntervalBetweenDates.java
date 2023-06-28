package com.nbicocchi.exercises.exceptions.b;

import java.text.ParseException;
import java.time.LocalDate;

public class _CheckIntervalBetweenDates {
    public static boolean checkIntervalBetweenDates(String begin, String end) throws ParseException {
        LocalDate beginDate = LocalDate.parse(begin);
        LocalDate endDate = LocalDate.parse(end);

        return beginDate.isBefore(endDate);
    }
}
