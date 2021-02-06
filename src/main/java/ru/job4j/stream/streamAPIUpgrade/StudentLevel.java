package ru.job4j.stream.streamAPIUpgrade;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StudentLevel {
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .filter(Objects::nonNull)
                .sorted((left, right) -> right.getSurname().compareTo(left.getSurname()))
                .takeWhile(st -> st.getScore() > bound)
                .collect(Collectors.toList());
    }
}