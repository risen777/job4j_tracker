package ru.job4j.tracker;

/**
 * Created by Sergey
 */
public class ConsoleOutput implements Output{

    @Override
    public void println(Object obj) {
        System.out.println(obj);
    }
}
