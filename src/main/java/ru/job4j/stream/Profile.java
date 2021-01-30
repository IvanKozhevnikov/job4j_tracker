package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profile {
    private Address address;

    public Profile(String city, String street, int home, int apartment) {
    }

    public static List<Address> collect(List<Profile> profiles) {
        List<Profile> clean = profiles.stream()
                .map(Address::getClass)
                .collect(Collectors.toList());
        clean.forEach(System.out::println);
        return collect(profiles);

    }
}
