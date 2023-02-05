package org.example.general.ch01.c3_return_boolean_expressions.solution;

public class Astronaut {
    String name;
    int missions;

    boolean isValid() {
        return missions >= 0 && name != null && !name.trim().isEmpty();
    }

    boolean isValid2() {
        boolean isValidMissions = missions >= 0;
        boolean isValidName = name != null && !name.trim().isEmpty();
        return isValidMissions && isValidName;
    }
}
