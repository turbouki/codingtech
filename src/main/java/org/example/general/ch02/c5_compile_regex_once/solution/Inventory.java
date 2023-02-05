package org.example.general.ch02.c5_compile_regex_once.solution;

import org.example.general.Supply;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Inventory {
    private List<Supply> supplies = new ArrayList<>();

    List<Supply> find(String regex) {
        List<Supply> result = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        for (Supply supply: supplies) {
            if (pattern.matcher(supply.toString()).matches()) {
                result.add(supply);
            }
        }
        return result;
    }
}
