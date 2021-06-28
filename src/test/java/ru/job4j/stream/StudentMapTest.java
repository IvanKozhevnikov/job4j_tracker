package ru.job4j.stream;

import org.junit.Test;
import ru.job4j.stream.student.Student;
import ru.job4j.stream.student.StudentMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class StudentMapTest {
    @Test
    public void collect() {
        List<Student> list = List.of(
                new Student(2, "Иванов"),
                new Student(6, "Дегтярёв"),
                new Student(6, "Дегтярёв"),
                new Student(6, "Дегтярёв"));
        Map<String, Integer> rsl = (StudentMap.collect(list));

        Map<String, Integer> expected = new HashMap<>();
        {
            expected.put("Иванов", 2);
            expected.put("Дегтярёв", 6);
        }

        assertEquals(rsl, expected);
    }
}
