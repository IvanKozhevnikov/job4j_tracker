package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;
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
        List<String> expected = Arrays.asList("Item{id=1, name='Reboot server'}",
                "Item{id=2, name='Impl task'}", "Item{id=4, name='Fix bugs'}");
        Assert.assertThat(item, is(expected));
    }
}