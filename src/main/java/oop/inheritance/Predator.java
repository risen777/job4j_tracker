package oop.inheritance;

/**
 * Created by Sergey
 */
public class Predator extends Animal {
    public Predator() {
        super();
        System.out.println("Predator");
    }

    public Predator(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Predator predator = new Predator();
        Predator predatorWithName = new Predator("Хищник");
    }
}
