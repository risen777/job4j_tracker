package ru.job4j.tracker.actions;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Tracker;

/**
 * Created by Sergey
 */
public class ExitAction implements UserAction {

    @Override
    public String name() {
        return "=== Exit Program ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
