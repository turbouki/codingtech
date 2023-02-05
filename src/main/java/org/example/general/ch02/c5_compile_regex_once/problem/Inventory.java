package org.example.general.ch02.c5_compile_regex_once.problem;

import org.example.general.Supply;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Inventory {
    private List<Supply> supplies = new ArrayList<>();

    List<Supply> find(String regex) {
        List<Supply> result = new ArrayList<>();
        for (Supply supply: supplies) {
            if (Pattern.matches(regex, supply.toString())) {
                result.add(supply);
            }
        }
        return result;
    }
}
