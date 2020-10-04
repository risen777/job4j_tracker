package ru.job4j.tracker.actions;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Output;
import ru.job4j.tracker.Tracker;

import java.util.List;



/**
 * Created by Sergey
 */
public class ShowAllItemsAction implements UserAction {

    private final Output out;

    public ShowAllItemsAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Show all items ====");
        List<Item> items = tracker.findAll();
        for (Item item : items) {
            out.println(items.indexOf(item) + ". Name: " + item.getName() + " id: " + item.getId());
        }
        return true;
    }

}
