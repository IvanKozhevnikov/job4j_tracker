package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class SearchAtt {

    private static List<Attachment> filter(List<Attachment> list, Predicate<Attachment> func) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (func.test(att)) {
                rsl.add(att);
                return rsl;
            }
        }
        return null;
    }

    public static List<Attachment> filterSize(List<Attachment> list) {
        Predicate<Attachment> func = attachment -> attachment.getSize() > 100;
        return filter(list, func);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        Predicate<Attachment> func = attachment -> attachment.getName().contains("bug");
        return filter(list, func);
    }

    public static void main(String[] args) {
        List<Attachment> list = Collections.singletonList(
                new Attachment("bug", 110));
        System.out.println(filterSize(list));
        System.out.println(filterName(list));
    }
}