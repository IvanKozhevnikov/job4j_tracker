package ru.job4j.collection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import ru.job4j.tracker.Item;

public class ItemSorter {
    public static void main(String[] args) {
        List<Item> item = Arrays.asList(
                new Item(4, "Fix bugs"),
                new Item(2, "Impl task"),
                new Item(1, "Reboot server")
        );
        Collections.sort(item, new SortByNameItemIncrease());
        System.out.println(item);
        Collections.sort(item, new ShortByNameItemDecrease());
        System.out.println(item);
    }
}