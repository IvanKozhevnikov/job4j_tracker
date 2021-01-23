package ru.job4j.stream;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class School {

    public static List<Student> collect(List<Student> list, Predicate<Student> predict) {
        List<Student> rsl = new ArrayList<>();
        for (Student st : list) {
            if (predict.test(st)) {
                rsl.add(st);
            }
        }
        return rsl;
    }
}