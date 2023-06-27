package com.nbicocchi.exercises.exceptions;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class _CheckIntervalBetweenDates {
    static LocalDate beginData;
    static LocalDate endData;

    public static boolean checkIntervalBetweenDates(String begin, String end)
    {
        LocalDate dateBegin = LocalDate.parse(begin);
        LocalDate dateEnd = LocalDate.parse(end);
        return dateBegin.isBefore(dateEnd);
    }


}
