package org.example.general.ch01.c6_avoid_switch_fail_through.solution;

import org.example.general.CruiseControl;
import org.example.general.User;

import java.util.Objects;

public class BoardComputer {
    CruiseControl cruiseControl;

    void authorize(User user) {
        // 아래 switch 문은 분리해야 할 두 가지 관심사를 섞고 있습니다. 허가받지 않은 접근과
        // 허가받은 접근을 하나의 블록으로 합쳤습니다.
        Objects.requireNonNull(user);
        switch (user.getRank()) {
            case UNKNOWN:
                cruiseControl.logUnauthorizedAccessAttempt();
                break;
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
