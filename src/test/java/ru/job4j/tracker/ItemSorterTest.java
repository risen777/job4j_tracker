package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Sergey
 */
public class ItemSorterTest {

    @Test
    public void whenItemsSorting() {
        List<Item> items = Arrays.asList(
                new Item(3, "Fix bugs"),
                new Item(2, "Impl task"),
                new Item(1, "Reboot server")
        );

        Item result = items.get(2);
        Collections.sort(items);
        assertThat(result, is(items.get(0)));
    }

    @Test
    public void whenItemsSortingReverse() {
        List<Item> items = Arrays.asList(
                new Item(1, "Fix bugs"),
                new Item(2, "Impl task"),
                new Item(3, "Reboot server")
        );

        Item result = items.get(2);
        Collections.sort(items, Collections.reverseOrder());
        assertThat(result, is(items.get(0)));
    }

}
