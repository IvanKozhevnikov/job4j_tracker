package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (start.equals("")) {
                    start += el;
                } else {
                    start += "/" + el;
                }
                tmp.add(start);
            }
        }
        return new ArrayList<>(tmp);
    }

    public static List<String> sortAsc(List<String> departments) {
        List<String> result = new ArrayList<>(fillGaps(departments));
        result.sort(null);
        return result;
    }

    public static List<String> sortDesc(List<String> departments) {
        List<String> result = new ArrayList<>(fillGaps(departments));
        result.sort(new DepDescComp());
        return result;
    }
}