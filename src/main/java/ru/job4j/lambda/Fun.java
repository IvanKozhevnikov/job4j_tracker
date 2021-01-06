package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Fun {
    public static void main(String[] args) {
        Student[] stud = {
                new Student("image 1", 20),
                new Student("image 3", 120),
                new Student("image 2", 23)
        };
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2){
                Student left = (Student) o1;
                Student right = (Student) o2;
                return left.getName().compareTo(right.getName());
            }
        };
        Arrays.sort(stud, comparator);
        System.out.println(stud[1]);
    }
    public static void raw(List<Student> list, Function<Student, Mark> func) {
        for (Student student : list) {
            func.apply(student);
        }
    }
}
