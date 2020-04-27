package oop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Sergey
 */
public class DummyDicTest {

    @Test
    public void whenEngWordIsWall() {
        String eng = "wall";
        DummyDic dummyDic = new DummyDic();

        String expected = "Неизвестное слово - wall";

        String out = dummyDic.engToRus(eng);
        assertThat(expected, is(out));

    }
}