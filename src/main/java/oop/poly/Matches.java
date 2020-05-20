package oop.poly;

import java.util.Scanner;

/**
 * Created by Sergey
 */
public class Matches {

    public static void main(String[] args) {
        int value = 11;
        boolean run = true;
        System.out.println("Игра");
        System.out.println("мысл игры в следующем. На столе лежат 11 спичек. Два игрока по очереди берут от 1 до 3 спичек. Выигрывает тот, кто забрал последние спички.");
        System.out.println("1 - забрать одну спичку");
        System.out.println("2 - забрать две спички");
        System.out.println("3 - забрать четыре спички");
        System.out.println("0 - выход");
        System.out.print("Введите цифру, чтобы начать игру: ");
        while (run) {
            System.out.println(value+ " - осталось спичек");
            Scanner input = new Scanner(System.in);
            int select = Integer.valueOf(input.nextLine());
            if (select == 1) {
                System.out.println("Игрок выбрал 1");
                value = value - 1;
            } else if (select == 2) {
                System.out.println("Игрок выбрал 2");
                value = value - 2;
            } else if (select == 3) {
                System.out.println("Игрок выбрал 3");
                value = value - 3;
            } else {
                System.out.println("Введена неправильная команда");
            }
            System.out.println();
            if (value < 1) {
                System.out.println("Вы проиграли");
                run = false;
            }
        }
    }
}


