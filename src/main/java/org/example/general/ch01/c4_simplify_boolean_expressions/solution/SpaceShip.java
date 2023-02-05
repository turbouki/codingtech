package org.example.general.ch01.c4_simplify_boolean_expressions.solution;

import org.example.general.ch01.c4_simplify_boolean_expressions.*;

public class SpaceShip {
    Crew crew;
    FuelTank fuelTank;
    Hull hull;
    Navigator navigator;
    OxygenTank oxygenTank;

    boolean willCrewSurvive() {
        boolean hasEnoughResources = hasEnoughFuel() && hasEnoughOxygen();
        return hull.isIntact() && hasEnoughResources;
    }

    private boolean hasEnoughOxygen() {
        return oxygenTank.lastsFor(crew.size) > navigator.timeToEarth();
    }

    private boolean hasEnoughFuel() {
        return  fuelTank.fuel >= navigator.requiredFuelToEarth();
    }
}
