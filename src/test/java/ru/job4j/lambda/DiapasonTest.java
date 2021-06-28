package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DiapasonTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = Diapason.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        List<Double> result = Diapason.diapason(3, 5, x -> Math.pow(x, 2));
        List<Double> expected = Arrays.asList(9D, 16D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenIndicativeFunctionThenIndicativeResults() {
        List<Double> result = Diapason.diapason(-5, -2, x -> Math.pow(2.71, x));
        List<Double> expected = Arrays.asList(0.006841534882751672D,
                0.018540559532257028D, 0.05024491633241655D);
        assertThat(result, is(expected));
    }
}
