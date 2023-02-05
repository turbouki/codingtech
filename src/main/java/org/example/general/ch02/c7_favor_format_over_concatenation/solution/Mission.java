package org.example.general.ch02.c7_favor_format_over_concatenation.solution;

import org.example.general.ch02.c7_favor_format_over_concatenation.Logbook;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Mission {
    Logbook logbook;
    LocalDate start;

    void update(String author, String message) {
        final LocalDate today = LocalDate.now();
        String entry = String.format("%S: [%tm-%<te-%<ty](Day %d)> %s%n",
                author, today,
                ChronoUnit.DAYS.between(start, today) + 1, message);
        logbook.write(entry);
    }
}
