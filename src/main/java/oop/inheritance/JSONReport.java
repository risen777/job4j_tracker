package oop.inheritance;

/**
 * Created by Sergey
 */
public class JSONReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        return "{"
                + System.lineSeparator()
                + "name: " + name
                + ","
                + System.lineSeparator()
                + "body: " + body
                + System.lineSeparator()+ "}";

    }
}


