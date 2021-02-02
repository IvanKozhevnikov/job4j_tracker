package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentMap {
    public static Map<String, Integer> collect(List<Student> students) {
        return students.stream()
                .collect(Collectors.toMap(
                        Student::getSurname, Student::getScore
                ));
    }

    public static void main(String[] args) {
        List<Student> ex = List.of(
                new Student(1, "Васильев"),
                new Student(2, "Иванов"),
                new Student(7, "Кожевников"),
                new Student(8, "Терешков"),
                new Student(10, "Колесников"),
                new Student(6, "Дегтярёв"),
                new Student(3, "Семёнов"));

        Map<String, Integer> rsl = collect(ex);
        System.out.println(rsl);
    }
}
