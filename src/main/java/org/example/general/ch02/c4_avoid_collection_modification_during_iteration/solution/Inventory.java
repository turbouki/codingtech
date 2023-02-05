
package org.example.general.ch02.c4_avoid_collection_modification_during_iteration.solution;

import org.example.general.Supply;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    private List<Supply> supplies = new ArrayList<>();

    void disposeContaminatedSupplies() {
        Iterator<Supply> iterator = supplies.iterator();
        while(iterator.hasNext()) {
            if (iterator.next().isContaminated()) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        Supply s1 = new Supply("s1");
        Supply s2 = new Supply("s2");
        Inventory i = new Inventory();
        i.supplies.add(s1);
        i.supplies.add(s2);
        System.out.println(i.supplies.size());
        i.disposeContaminatedSupplies();
        System.out.println(i.supplies.size());
    }
}
