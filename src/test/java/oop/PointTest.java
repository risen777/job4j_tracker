package oop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Sergey
 */
public class PointTest {

    @Test
    public void whenDistance2d() {
        double expected = 2.82;
        Point a = new Point(4, 4);
        Point b = new Point(2, 2);
        double actual = a.distance(b);
        assertEquals(expected, actual, 0.01);

    }

    @Test
    public void whenDistance3d() {
        double expected = 3.46;
        Point a = new Point(4, 4, 4);
        Point b = new Point(2, 2, 2);
        double actual = a.distance3d(b);
        assertEquals(expected, actual, 0.01);
    }
}