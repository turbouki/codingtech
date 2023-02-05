package org.example.general.ch02.c2_favor_enums_over_integer_constants.problem;

public class CruiseControl {

    static final int STOP_PRESET = 0;
    static final int PLANETARY_SPEED_PRESET = 1;
    static final int CRUISE_SPEED_PRESET = 2;

    static final double CRUISE_SPEED_KMH = 16944;
    static final double PLANETARY_SPEED_KMH = 7767;
    static final double STOP_SPEED_KMH = 0;
    private double targetSpeedKmh;

    void setPreset(int speedPreset) {
        if (speedPreset == CRUISE_SPEED_PRESET) {
            setTargetSpeedKmh(CRUISE_SPEED_KMH);
        } else if (speedPreset == PLANETARY_SPEED_PRESET ) {
            setTargetSpeedKmh(PLANETARY_SPEED_KMH);
        } else if (speedPreset == STOP_PRESET) {
            setTargetSpeedKmh(STOP_SPEED_KMH);
        }
    }

    void setTargetSpeedKmh(double speed) {
        targetSpeedKmh = speed;
    }
}

class Main {
    static final int STOP_PRESET = 0;
    static final int PLANETARY_SPEED_PRESET = 1;
    static final int CRUISE_SPEED_PRESET = 2;
    static void usage() {
        CruiseControl cruiseControl = null;
        cruiseControl.setPreset(PLANETARY_SPEED_PRESET);
        cruiseControl.setPreset(CRUISE_SPEED_PRESET);
        cruiseControl.setPreset(-1);
    }
}