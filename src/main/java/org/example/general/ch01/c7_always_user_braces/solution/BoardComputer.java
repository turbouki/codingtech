package org.example.general.ch01.c7_always_user_braces.solution;

import org.example.general.CruiseControl;
import org.example.general.User;

import java.util.Objects;

public class BoardComputer {
    CruiseControl cruiseControl;

    void authorize(User user) {
        // 중광호를 사용하면 나중에 새 코드 행도 안전하게 추가 할 수 있음
        // 오류룰 쉽게 발견 할 수 있음
        Objects.requireNonNull(user);
        if (user.isUnknown()) {
            cruiseControl.logUnauthorizedAccessAttempt();
        }
        if (user.isAstronaut()) {
            cruiseControl.grantAccess(user);
        }
        if (user.isCommander()) {
            cruiseControl.grantAccess(user);
        }
        cruiseControl.grantAdminAccess(user);  // 보안 위협
    }
}
