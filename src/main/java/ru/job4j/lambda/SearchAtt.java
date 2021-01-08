package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class SearchAtt {

    private static Attachment filter(int att, Function<Attachment, Attachment> func, Supplier<Integer> initValue) {
        List<Attachment> rsl = new ArrayList<>();

        if (att > initValue || att.contains("bag")) {
            func.apply(rsl.add(att));
        }
        return (Attachment) rsl;
    }


    public static List<Attachment> filterSize(int att) {
        Function<Attachment, Attachment> func = new Function<Attachment, Attachment>() {
            @Override
            public Attachment apply(Attachment attachment) {
                return attachment;
            }
        };
        Supplier<Integer> initValue = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 100;
            }
        };
        return filter(att, func, initValue);
    }

    public static List<Attachment> filterName(String att) {
        Function<Attachment, Attachment> func = new Function<Attachment, Attachment>() {
            @Override
            public Attachment apply(Attachment attachment) {
                return attachment;

            }
        };
        Supplier<String> initValue = new Supplier<String>() {
            @Override
            public String get() {
                return "bug";
            }
        };
        return filter(att, func, initValue);
    }


    public static void main(String[] args) {

        System.out.println(filterSize(100));
        System.out.println(filterName("bag"));
    }
}