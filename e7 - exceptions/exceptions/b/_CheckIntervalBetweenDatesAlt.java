package com.nbicocchi.exercises.exceptions.b;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class _CheckIntervalBetweenDatesAlt {
    public static boolean checkIntervalBetweenDatesAlt(String begin, String end) {
        try {
            LocalDate beginDate = LocalDate.parse(begin);
            LocalDate endDate = LocalDate.parse(end);

            return beginDate.isBefore(endDate);
        } catch (DateTimeParseException e) {
            System.out.println("Errore in parsing the date string");
            return false;
        }

    }
}
