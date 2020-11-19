package ru.job4j.tracker;

import org.junit.Test;


import java.util.Arrays;
import java.util.List;

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
        List <Item> ex = tracker.findAll();
        List  <Item> res = Arrays.asList(new Item[]{item, item1});
        assertThat(ex, is(res));

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
        List <Item> ex = tracker.findByName("test2");
        List <Item> res = Arrays.asList(new Item[]{item2});
        assertThat(ex, is(res));
        }



    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        int id = bug.getId();
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
        int id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }

    @Test
    public void whenReplaceIdNoTime() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        int id = 123;
        tracker.add(bug).setId(id);
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));

    }
}