package collection;

import java.util.ArrayList;

/**
 * Created by Sergey
 */
public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Petr");
        names.add("Ivan");
        names.add("Stepan");

        for(Object name : names){
            System.out.println(name);
        }


    }


}
