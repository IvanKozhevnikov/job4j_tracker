package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profile {
    private Address address;

    public Profile(String city, String street, int home, int apartment) {
    }

    public static List<Address> collect(List<Profile> profiles) {
        profiles.stream()
                .map(Profile::getClass)
                .filter(a -> false)
                .collect(Collectors.toList());
                profiles.forEach(System.out::println);
        return null;
    }

    public static void main(String[] args) {
        List<Profile> addresses = List.of(
                new Profile("Moscov", "Dostoevskogo", 10, 9));
        collect(addresses);

    }




}
