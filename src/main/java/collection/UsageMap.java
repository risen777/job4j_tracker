package collection;

import java.util.HashMap;

/**
 * Created by Sergey
 */
public class UsageMap {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("parsentev@yandex.ru1", "Petr Arsentev");
        map.remove("parsentev@yandex.ru1");
        for(String key : map.keySet()){
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }




}
