package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfileTest {
    @Test
    public void Collect() {

        List<Profile> expected = List.of(
                new Profile("Moscov"));
        List<Address> rsl = Profile.collect(expected);
        assertThat(rsl, is(expected));
    }
}
