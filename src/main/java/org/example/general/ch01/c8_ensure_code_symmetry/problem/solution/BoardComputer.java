package org.example.general.ch01.c8_ensure_code_symmetry.problem.solution;

import org.example.general.CruiseControl;
import org.example.general.User;

import java.util.Objects;

public class BoardComputer {
    CruiseControl cruiseControl;

    void authorize(User user) {
        Objects.requireNonNull(user);
        if (user.isUnknown()) {
            cruiseControl.logUnauthorizedAccessAttempt();
            return;
        }

        if (user.isAstronaut()) {
            cruiseControl.grantAccess(user);
        } else if (user.isCommander()) {
            cruiseControl.grantAccess(user);
            cruiseControl.grantAdminAccess(user);
        }
    }

}
