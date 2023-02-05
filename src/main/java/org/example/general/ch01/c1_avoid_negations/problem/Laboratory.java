package org.example.general.ch01.c1_avoid_negations.problem;

import org.example.general.Microscope;
import org.example.general.Result;
import org.example.general.Sample;

// 1.2 부정 피하기
public class Laboratory {
    Microscope microscope;

    Result analyze(Sample sample) {
        if (microscope.isInorganic(sample)) {
            return Result.INORGANIC;
        } else {
            return analyzeOrganic(sample);
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
