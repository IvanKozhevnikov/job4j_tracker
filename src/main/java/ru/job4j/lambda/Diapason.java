package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Diapason {
    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> rsl = new ArrayList<>();
        for (double x = start; x < end; x++) {

            rsl.add(func.apply(x));
        }
        return rsl;
    }

    public static List<Double> linear(int start, int end) {
        Function<Double, Double> func = x -> x;
        return diapason(start, end, func);
    }
}