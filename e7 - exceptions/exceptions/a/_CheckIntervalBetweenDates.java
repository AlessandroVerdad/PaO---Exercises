package com.nbicocchi.exercises.exceptions.a;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class _CheckIntervalBetweenDates {
    public static boolean checkIntervalBetweenDates(String begin, String end) throws ParseException
    {
        LocalDate dateBegin = LocalDate.parse(begin);
        LocalDate dateEnd = LocalDate.parse(end);
        return dateBegin.isBefore(dateEnd);
    }


}
