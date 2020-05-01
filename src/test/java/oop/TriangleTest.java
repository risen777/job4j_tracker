package oop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by Sergey
 */
public class TriangleTest {
    Triangle triangle = new Triangle(2.0, 2.0, 2.0);

    @Test
    public void whenExist() {
        boolean result = triangle.exist();
        assertThat(result, is(true));
    }

    @Test
    public void whenNonExist() {
        Triangle triangleNonExist = new Triangle(1.0, 1.1, 3.0);
        boolean result = triangleNonExist.exist();
        assertThat(result, is(false));
    }


    @Test
    public void square() {
        double expected = 1.73;
        double actual = triangle.area();
        assertEquals(expected, actual, 0.01);

    }


    @Test
    public void period() {
        double expected = 3.0;
        double actual = triangle.period();
        assertEquals(expected, actual, 0.01);

    }
}
