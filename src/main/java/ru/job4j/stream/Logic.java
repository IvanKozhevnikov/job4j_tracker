package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Logic {
    public static List<Address> collect(List<Profile> profiles) {
        return  profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<Profile> ex = List.of(
                new Profile("Moscow", "Dostoevskogo", 10, 9));
        for (Profile p : ex) {
            System.out.println(p.getAddress());
        }
        List<Address> rsl = Logic.collect(ex);
        for (Address p : rsl) {
            System.out.println(p.toString());
        }
    }
}
