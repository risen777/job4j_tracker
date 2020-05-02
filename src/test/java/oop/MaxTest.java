package oop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Sergey
 */
public class MaxTest {

    @Test
    public void whenMaxIs0() {
        int expected = 0;
        int actual = Max.max(0, -1);
        assertThat(expected, is(actual));
    }

    @Test
    public void whenMaxIs1() {
        int expected = 1;
        int actual = Max.max(0, -1, 1);
        assertThat(expected, is(actual));
    }

    @Test
    public void whenMaxIs2() {
        int expected = 2;
        int actual = Max.max(0, -1, 1, 2);
        assertThat(expected, is(actual));
    }
}