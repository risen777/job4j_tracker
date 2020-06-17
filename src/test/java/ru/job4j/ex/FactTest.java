package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.job4j.ex.Fact.calc;

/**
 * Created by Sergey
 */
public class FactTest {


    @Test(expected = IllegalArgumentException.class)
    public void whenFactExc() {
        calc(-1);

    }
}