package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Sergey
 */
public class TrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenCheckFindAll() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item item1 = new Item("test2");
        tracker.add(item1);
        Item[] items = tracker.findAll();
        assertThat(items[0].getName(), is(item.getName()));
        assertThat(items[0].getId(), is(item.getId()));
        assertThat(items[1].getId(), is(item1.getId()));
        assertThat(items.length,is(2));

    }

    @Test
    public void whenCheckByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item item1 = new Item("test1");
        tracker.add(item1);
        Item item2 = new Item("test2");
        tracker.add(item2);
        Item[] items = tracker.findByName("test1");
        for (int i=0;i<items.length;i++){
           assertThat(items[i].getName(),is("test1"));
            assertThat(items.length,is(2));
        }

    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
        Item bugWithDesc2 = new Item("Bug with description2");
        tracker.replace(id, bugWithDesc2);
        assertThat(tracker.findById(id).getName(), is("Bug with description2"));

    }


    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }

    @Test
    public void whenReplaceIdNoTime() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        String id = "123";
        tracker.add(bug).setId(id);
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));

    }
}