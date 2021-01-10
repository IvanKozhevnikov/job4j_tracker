package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class LazyLoading {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Ivan",
                "Petr"
        );
        Consumer<String> consumer = System.out::println;
        names.forEach(consumer);
    }
}