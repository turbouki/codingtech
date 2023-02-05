package org.example.general.ch01.c3_return_boolean_expressions.problem;

public class Astronaut {
    String name;
    int missions;

    // 1.3 불 표현식을 직접 반환
    boolean isValid() {
        if (missions < 0 || name == null || name.trim().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
