package oop;

/**
 * Created by Sergey
 */
public class College {
    public static void main(String[] args) {
        //Создаем объект класса Freshman
        Freshman freshman = new Freshman();
        //делаем приведение к типу родителя Ftudent
        Student student = freshman;
        //делаем приведение к типу родителя Object
        Object obj = freshman;

    }

}
