package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.actions.*;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


/**
 * Created by Sergey
 */
public class StartUITest {


    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1", "2", "Item name", "3"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new ShowAllItemsAction(out),
                new FindByNameAction(out),
                new ExitAction(out),
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "=== Create a new Item ====" + System.lineSeparator() +
                        "=== Show all items ====" + System.lineSeparator() +
                        "=== Find items by name ====" + System.lineSeparator() +
                        "Exit" + System.lineSeparator()
        ));
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        /* Добавим в tracker новую заявку */
        Item item = tracker.add(new Item("Replaced item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[]{"0", item.getId(), replacedName, "1", replacedName, "2"}
        );
        UserAction[] actions = {
                new ReplaceAction(out),
                new FindByNameAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String name = tracker.findById(item.getId()).getName();
        assertThat(out.toString(), is(
                "=== Edit item ===" + System.lineSeparator() +
                        "=== Find items by name ====" + System.lineSeparator() +
                        "Exit" + System.lineSeparator()
        ));
        assertThat(name, is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        /* Добавим в tracker новую заявку */
        Item item = tracker.add(new Item("Deleted item"));
        String id = item.getId();
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        Input in = new StubInput(
                new String[]{"0", id, "1", id, "2"}
        );
        UserAction[] actions = {
                new DeleteAction(out),
                new FindByIdAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "=== Delete item ====" + System.lineSeparator() +
                        "=== Find item by Id ====" + System.lineSeparator() +
                        "Exit" + System.lineSeparator()
        ));
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }


}