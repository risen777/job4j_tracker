package oop.inheritance;

/**
 * Created by Sergey
 */
public class Animal {

    public Animal() {
        System.out.println("Animal");
    }

    public Animal(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animalWithName = new Animal("Животное");


    }
}
