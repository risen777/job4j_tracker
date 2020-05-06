package oop.encapsulation.pojo;

import java.util.Date;

/**
 * Created by Sergey
 */
public class College {


    public static void main(String[] args) {
        Student alex = new Student();
        alex.setFullName("Алексей Алексеевич Алексеев");
        alex.setGroup("22-212");
        alex.setDateOfarrival("22.02.2020");

        System.out.println("ФИО = " + alex.getFullName() + System.lineSeparator() + "Группа = " + alex.getGroup() + System.lineSeparator() + "Дата прибытия = " + alex.getDateOfarrival());

    }
}
