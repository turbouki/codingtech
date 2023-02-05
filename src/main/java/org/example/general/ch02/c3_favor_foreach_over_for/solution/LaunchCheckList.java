package org.example.general.ch02.c3_favor_foreach_over_for.solution;

import org.example.general.ch02.c3_favor_foreach_over_for.Commander;
import org.example.general.ch02.c3_favor_foreach_over_for.Status;

import java.util.Arrays;
import java.util.List;

public class LaunchCheckList {
    List<String> checks = Arrays.asList("Cabin Pressure", "Communication", "Engine");

    Status prepareFotTakeoff(Commander commander) {
        for (String check : checks) {
            boolean shouldAbortTakeoff = commander.isFailing(check);
            if (shouldAbortTakeoff) {
                return Status.ABORT_TAKE_OFF;
            }
        }
        return Status.READY_FOR_TAKE_OFF;
    }
}

