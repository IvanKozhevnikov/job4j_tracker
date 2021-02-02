package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Logic {
    public static List<Address> collect(List<Profile> profiles) {
        return  profiles.stream()
                .map(Profile::getAddress)
                .sorted(Comparator.comparing(Address::getCity))
                .distinct()
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<Profile> ex = List.of(
                new Profile("Moscow", "Dostoevskogo", 10, 9),
                new Profile("Kazan", "Dostoevskogo", 10, 9),
                new Profile("Arkhangelsk", "Dostoevskogo", 10, 9),
                new Profile("Moscow", "Dostoevskogo", 10, 9),
                new  Profile("Saint-Petersburg", "Dostoevskogo", 10, 9),
                new  Profile("Yaroslavl", "Dostoevskogo", 10, 9),
                new  Profile("Orenburg", "Dostoevskogo", 10, 9));

        List<Address> rsl = Logic.collect(ex);
        for (Address p : rsl) {
            System.out.println(p.toString());
        }
    }
}
