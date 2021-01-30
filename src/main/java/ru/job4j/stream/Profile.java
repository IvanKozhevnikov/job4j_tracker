package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profile {
    private Address address;

    public Profile(Address s) {
    }

    public Address getAddress() {
        return address;
    }

    public static List<Address> collect(List<Profile> profiles) {
        List<Address> copy = profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
        return copy;
    }

    public static void main(String[] args) {
        List<Profile> ex = List.of(
                new Profile(new Address("Moscov", "Dostoevskogo", 10, 9)));
        List<Address> rsl = Profile.collect(ex);
        System.out.println(rsl);
    }
}
