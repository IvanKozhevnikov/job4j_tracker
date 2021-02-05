package ru.job4j.stream.card;

import static ru.job4j.stream.card.Suit.*;
import static ru.job4j.stream.card.Value.*;

public class DoubleLoop {
    public static void main(String[] args) {
        Value[] levels = {V_6, V_7, V_8};
        Suit[] tasks = {Diamonds, Hearts, Spades, Clubs};
        for (Value level : levels) {
            for (Suit task : tasks) {
                System.out.println(level + " " + task);
            }
        }
    }
}