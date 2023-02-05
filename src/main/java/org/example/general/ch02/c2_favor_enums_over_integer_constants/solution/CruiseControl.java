package org.example.general.ch02.c2_favor_enums_over_integer_constants.solution;

import java.util.Objects;

public class CruiseControl {

    private double targetSpeedKmh;
    void setPreset(SpeedPreset speedPreset) {
        Objects.requireNonNull(speedPreset);
        setTargetSpeedKmh(speedPreset.speedKmh);
    }

    void setTargetSpeedKmh(double speedKmh) {
        targetSpeedKmh = speedKmh;
    }
}

enum SpeedPreset {
    STOP(0), PLANETARY_SPEED(7667), CRUISE_SPEED(16944);

    final double speedKmh;

    SpeedPreset(double speedKmh) {
        this.speedKmh = speedKmh;
    }
}
class Main {
    static void usage() {
        CruiseControl cruiseControl = null;
        cruiseControl.setPreset(SpeedPreset.PLANETARY_SPEED);
        cruiseControl.setPreset(SpeedPreset.CRUISE_SPEED);
    }
}