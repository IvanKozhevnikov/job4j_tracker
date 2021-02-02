package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profile {
    private Address address;
    private String city;

    public Profile(String city) {
        this.city = city;
    }

    public Address getAddress() {
        return address;
    }

    public static List<Address> collect(List<Profile> profiles) {
        List<Address> copy = profiles.stream()
                .map(Profile::getAddress) // немогу понять что сдесь происходит
                //getAddress это метод для доступа к значению переменной address
                //Profile это тип данных Profile
                //получается сдесь осуществляется перевод из типа данных Profile в Address
                .collect(Collectors.toList()); //данные потока записываются в виде коллекцию List
        copy.forEach(System.out::println);
        return copy;
    }

    public static void main(String[] args) {
        List<Profile> ex = List.of(
                new Profile("Moscov"));
        for (Profile p : ex) {
            System.out.println(p.city);
        }
        List<Address> rsl = Profile.collect(ex);
    }
}
