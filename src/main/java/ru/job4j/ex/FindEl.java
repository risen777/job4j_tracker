package ru.job4j.ex;



/**
 * Created by Sergey
 */
public class FindEl {

    public static void main(String[] args) {
        try {
            indexOf(new String[]{"sss", "dddsss", "kam"}, "dddd");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }


    }


    public static int indexOf(String[] values, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == key) {
                rsl = i;
                break;
            }

        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;
    }


}