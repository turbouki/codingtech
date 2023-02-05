package org.example.general.ch01.c6_avoid_switch_fail_through.problem;

import org.example.general.CruiseControl;
import org.example.general.User;

import java.util.Objects;

public class BoardComputer {
    CruiseControl cruiseControl;

    void authorize(User user) {
        Objects.requireNonNull(user);
        switch (user.getRank()) {
            case UNKNOWN:
                cruiseControl.logUnauthorizedAccessAttempt();
            case ASTRONAUT:
                cruiseControl.grantAccess(user);
                break;
            case COMMANDER:
                cruiseControl.grantAccess(user);
                cruiseControl.grantAdminAccess(user);
                break;
        }
    }

}
