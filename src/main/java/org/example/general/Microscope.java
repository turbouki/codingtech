package org.example.general;

public interface Microscope {
    boolean isHumanoid(Sample sample);
    boolean isInorganic(Sample sample);

    boolean isOrganic(Sample sample);
}
