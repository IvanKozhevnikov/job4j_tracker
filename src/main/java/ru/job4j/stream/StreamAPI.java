package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(-110, 90, 100);
        List<Integer> clean = numbers.stream().filter(
                num -> num > 0).collect(Collectors.toList());
        clean.forEach(System.out::println);
    }
}
