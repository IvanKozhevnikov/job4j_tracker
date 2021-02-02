package ru.job4j.stream;

import java.util.Objects;

public class Profile {
    private Address address;

    public Profile(String city, String street, int home, int apartment) {
        this.address = new Address(city, street, home, apartment);
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Profile profile = (Profile) o;
        return Objects.equals(address, profile.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }

    @Override
    public String toString() {
        return String.valueOf(address);
    }
}