package oop.inheritance;

/**
 * Created by Sergey
 */
public class Tiger extends Predator {
    public Tiger() {
        super();
        System.out.println("Tiger");
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
    }
}
