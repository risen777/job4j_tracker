package oop;

/**
 * Created by Sergey
 */
public class Triangle {

    private double first;
    private double second;
    private double third;

    public Triangle(double ap, double bp, double cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Метод вычисления периметра по длинам сторон.
     * <p>
     * Формула.
     * <p>
     * (a + b + c) / 2
     *
     * @return Периметр.
     */
    public double period() {

        double p = -1;
        if (exist()) {
            p = (this.first + this.second + this.third) / 2;

        }
        return p;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     * <p>
     * Формула.
     * <p>
     * √ p *(p - ab) * (p - ac) * (p - bc)
     * <p>
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть площадь, если треугольник существует или -1.
     */
    public double area() {
        double rsl = -1;
        double p = period();
        if (exist()) {
            rsl = Math.sqrt(p * (p - this.first) * (p - this.second) * (p - this.third));

        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     * <p>
     * Условие существования
     * <p>
     * (a+c)>b&&(c+b)>a&&(a+b)>c
     * <p>
     *
     * @return Результат true, если существует иначе false
     */
    public boolean exist() {
        return (this.first + this.third > this.second && (this.third + this.second > this.first && (this.first + this.second > this.third)));
    }
}


