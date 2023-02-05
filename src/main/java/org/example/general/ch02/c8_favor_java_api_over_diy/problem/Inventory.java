package org.example.general.ch02.c8_favor_java_api_over_diy.problem;

import org.example.general.Supply;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Supply> supplies = new ArrayList<>();

    int getQuantity(Supply supply) {
        if (supply == null) {
            throw new NullPointerException("supply must not be null");
        }

        int quantity = 0;
        for(Supply supplyStock : supplies) {
            if (supply.equals(supplyStock)) {
                quantity++;
            }
        }
        return quantity;
    }
}
