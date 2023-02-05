package org.example.general.ch02.c7_favor_format_over_concatenation.problem;

import org.example.general.ch02.c7_favor_format_over_concatenation.Logbook;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Mission {
    Logbook logbook;
    LocalDate start;

    void update(String author, String message) {
        LocalDate today = LocalDate.now();
        String month = String.valueOf(today.getMonthValue());
        String formattedMonth = month.length() < 2 ? "0" + month : month;
        String entry = author.toUpperCase() + ": [" + formattedMonth + "-" +
                today.getDayOfMonth() + "-" + today.getYear() + "](Day " +
                (ChronoUnit.DAYS.between(start, today) + 1) + ")> " +
                message + System.lineSeparator();
        logbook.write(entry);
    }
}
