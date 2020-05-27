package oop;

/**
 * Класс - Студент
 *
 * @author shumov
 */
public class Student extends College {

    /**
     * @param lyrics
     */
    public void music(String lyrics) {

        System.out.println("I can sign a song : " + lyrics);
    }

    public void song() {

        System.out.println("I believe I can fly");
    }

    /**
     * Собираем объект Студент
     *
     * @param args
     */
    public static void main(String[] args) {
        String song = "I believe, I can fly";
        Student petya = new Student();
        petya.song();
        petya.song();
        petya.song();

        petya.music(song);
        petya.music(song);
        petya.music(song);


    }

}
