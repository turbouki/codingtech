package org.example.general.ch01.c1_avoid_negations.solution;

import org.example.general.Microscope;
import org.example.general.Result;
import org.example.general.Sample;

public class Laboratory {
    Microscope microscope;

    Result analyze(Sample sample) {
        if (microscope.isOrganic(sample)) {
            return analyzeOrganic(sample);
        } else {
            return Result.INORGANIC;
        }
    }

    private Result analyzeOrganic(Sample sample) {
        if (!microscope.isHumanoid(sample)) {
            return Result.ALIEN;
        } else {
            return Result.HUMANOID;
        }
    }
}
