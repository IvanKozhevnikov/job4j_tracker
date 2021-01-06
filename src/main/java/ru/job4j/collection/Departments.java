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

    public static void sortAsc(List<String> orgs) {
        DepAscComp cmp = new DepAscComp();
        Collections.sort(orgs, cmp);
    }

    public static void sortDesc(List<String> orgs) {
        DepDescComp cmp = new DepDescComp();
        Collections.sort(orgs, cmp);
    }
}