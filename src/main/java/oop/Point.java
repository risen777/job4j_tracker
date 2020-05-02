package oop;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Created by Sergey
 */
public class Point {


    private double x;

    private double y;

    private double z;

    /**
     * Конструтор, который принимает начальное состояние объекта "точка"
     *
     * @param x координата x
     * @param y координата y
     */

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Конструтор, который принимает начальное состояние объекта "точка"
     *
     * @param x координата x
     * @param y координата y
     * @param z координата z
     */

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }

    public void info3d() {
        System.out.println(String.format("Point[%s, %s,%s]", this.x, this.y, this.z));
    }

    public double distance3d(Point that) {
        return sqrt(pow(distance(that), 2) + pow(this.z - that.z, 2));
    }


    public static void main(String[] args) {
        Point a = new Point(4, 4);
        Point b = new Point(2, 2);
        double dist = a.distance(b);
        Point c = new Point(4, 4, 4);
        Point d = new Point(2, 2, 2);
        double dist3d = c.distance3d(d);
        a.info();
        b.info();
        System.out.println(dist);
        c.info3d();
        d.info3d();
        System.out.println(dist3d);
    }
}

