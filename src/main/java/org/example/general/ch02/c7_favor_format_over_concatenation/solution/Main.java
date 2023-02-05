package org.example.general.ch02.c7_favor_format_over_concatenation.solution;


import org.example.general.ch02.c7_favor_format_over_concatenation.Logbook;
import org.example.general.ch02.c7_favor_format_over_concatenation.solution.Mission;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Mission mission = new Mission();
        mission.logbook = new Logbook();
        mission.start = LocalDate.now() ;
        mission.update("liya", "hi");
    }
}
