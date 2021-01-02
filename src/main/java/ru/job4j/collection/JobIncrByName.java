package ru.job4j.collection;

import java.util.Collections;
import java.util.Comparator;

public class JobIncrByName implements Comparator<Job> {

    @Override
    public int compare(Job o1, Job o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
