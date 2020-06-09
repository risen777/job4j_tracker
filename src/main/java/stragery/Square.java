package stragery;

/**
 * Created by Sergey
 */
public class Square implements Shape {

    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return    "________" + ln
                + "|      |" + ln
                + "|______|" + ln;
    }

    public static void main(String[] args) {
        System.out.println(new Square().draw());
    }
}
