package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.collection.ShortByNameItemDecrease;
import ru.job4j.collection.SortByNameItemIncrease;

import java.util.*;

import static org.hamcrest.core.Is.is;

public class SortIncreaseDecreaseTest {
    @Test
    public void SortIncrease() {
        List<Item> item = Arrays.asList(
                new Item(4, "Fix bugs"),
                new Item(2, "Impl task"),
                new Item(1, "Reboot server")
        );
        Collections.sort(item, new SortByNameItemIncrease());
        List<Item> expected = Arrays.asList(
                new Item(1, "Reboot server"),
                new Item(2, "Impl task"),
                new Item(4, "Fix bugs")
        );
        Assert.assertThat(item, is(expected));
    }

    @Test
    public void SortDecrease() {
        List<Item> item = Arrays.asList(
                new Item(4, "Fix bugs"),
                new Item(2, "Impl task"),
                new Item(1, "Reboot server")
        );
        Collections.sort(item, new ShortByNameItemDecrease());
        List<Item> expected = Arrays.asList(
                new Item(4, "Fix bugs"),
                new Item(2, "Impl task"),
                new Item(1, "Reboot server")
        );
        Assert.assertThat(item, is(expected));
    }
}