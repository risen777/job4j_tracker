package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergey
 */
public class ConvertList {



    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
      for (int[] values :list) {
          for (int value : values) {

              rsl.add(value);
          }
      }

        return rsl;
    }










}
