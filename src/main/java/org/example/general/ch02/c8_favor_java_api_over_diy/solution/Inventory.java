package org.example.general.ch02.c8_favor_java_api_over_diy.solution;

import org.example.general.Supply;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Inventory {
    private List<Supply> supplies = new ArrayList<>();

    int getQuantity(Supply supply) {
        Objects.requireNonNull(supply, "supply must not be null");
        return Collections.frequency(supplies, supply);
    }
}
