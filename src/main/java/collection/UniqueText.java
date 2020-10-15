package collection;

import java.util.HashSet;

/**
 * Created by Sergey
 */
public class UniqueText {

    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        /* for-each origin -> new HashSet. */
        for (String originWord : origin) {
            check.add(originWord);

        }
        /* for-each text -> hashSet.contains */
        for (String duplicateWord : text) {
            rsl = check.contains(duplicateWord);
            if (!rsl) {
                break;
            }
        }


        return rsl;
    }


}
