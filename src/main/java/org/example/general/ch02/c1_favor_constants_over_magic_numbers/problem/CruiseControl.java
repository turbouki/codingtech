package org.example.general.ch02.c1_favor_constants_over_magic_numbers.problem;

public class CruiseControl {
    private double targetSpeedKmh;

    void setPreset(int speedPreset) {
        if (speedPreset == 2) {
            setTargetSpeedKmh(16944);
        } else if (speedPreset == 1) {
            setTargetSpeedKmh(7767);
        } else if (speedPreset == 0) {
            setTargetSpeedKmh(0);
        }
    }

    void setTargetSpeedKmh(double speed) {
        targetSpeedKmh = speed;
    }
}

class Main {
    static void usage() {
        CruiseControl cruiseControl = null;
        cruiseControl.setPreset(1);
        cruiseControl.setPreset(2);
        cruiseControl.setPreset(-1);
    }
}