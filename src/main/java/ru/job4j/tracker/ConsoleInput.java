package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Created by Sergey
 */
public class ConsoleInput implements Input {


    private Scanner scanner = new Scanner(System.in);

    @Override
    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    @Override
    public int askInt(String question) {
        int i = 1;
        try {
             i = Integer.valueOf(askStr(question));
        } catch (NumberFormatException ex) {
        }
        return i;
    }
}