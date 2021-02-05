package ru.job4j.stream.card;

import java.util.stream.Stream;

import static ru.job4j.stream.card.Suit.*;
import static ru.job4j.stream.card.Value.*;

public class DoubleLoop {
    public static void main(String[] args) {

        Value[] values = {V_6, V_7, V_8, V_9, V_10, V_J, V_Q, V_K, V_A};
        Suit[] suits = {Diamonds, Hearts, Spades, Clubs};
        Card card = new Card(suits, values);
        Stream.of(card.getValue())
                .flatMap(value -> Stream.of(card.getSuit())
                        .map(suit -> value + " " + suit))
                .forEach(System.out::println);
    }
}
