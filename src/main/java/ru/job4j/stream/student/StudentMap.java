package ru.job4j.stream.student;

import ru.job4j.stream.student.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentMap {
    public static Map<String, Integer> collect(List<Student> students) {
        return students.stream()
                .collect(Collectors.toMap(
                        Student::getSurname, Student::getScore,
                        (add1, add2) -> {
                            System.out.println("duplicate key found!");
                            return add1;
                        }
                ));
    }
}
