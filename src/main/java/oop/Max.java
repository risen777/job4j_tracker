package oop;

/**
 * Created by Sergey
 */
public class Max {


    /**
     * Метод вычисления максимума из двух значений
     * @param first
     * @param second
     * @return максимальное число
     */
    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;

    }

    /**
     * Метод вычисления максимума из трех значений
     * @param first
     * @param second
     * @param third
     * @return максимальное число
     */
    public static int max(int first, int second, int third) {
        int result = first > max(second, third) ? first : max(second, third);
        return result;
    }

    /**
     * Метод вычисления максимума из четырех значений
     * @param first
     * @param second
     * @param third
     * @param four
     * @return максимальное число
     */
    public static int max(int first, int second, int third,int four) {
        int result = first > max(second, third,four) ? first : max(second, third,four);
        return result;
    }


}
