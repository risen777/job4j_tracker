package ru.job4j.ex;

import java.util.Arrays;


/**
 * Created by Sergey
 */
public class FindEl {

    public static void main(String[] args) {
        try {
            if (indexOf(new String[]{"sss", "dddsss", "kam"}, "dddd") == -1) {
                throw new ElementNotFoundException("Element not found");
            }
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }


    }


    public static int indexOf(String[] values, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == key) {
                rsl = i;
            }

        }
        return rsl;
    }


}