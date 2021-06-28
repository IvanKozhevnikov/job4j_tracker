package ru.job4j.stream;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class MatrixTest {
    @Test
    public void collect() {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );
        List<Integer> rsl = Matrix.collect(matrix);
        List<Integer> expected = List.of(1, 2, 3, 4);
        assertEquals(rsl, expected);
    }
}
