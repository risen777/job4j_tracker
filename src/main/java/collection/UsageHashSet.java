package collection;

import java.util.HashSet;

/**
 * Created by Sergey
 */
public class UsageHashSet {

    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<String>();

        autos.add("Lada");
        autos.add("BMW");
        autos.add("Volvo");
        autos.add("Toyota");

        for (String auto : autos) {
            System.out.println(auto);
        }


    }


}
