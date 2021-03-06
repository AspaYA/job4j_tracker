package ru.job4j.oop;

import ru.job4j.condition.Point;

public class Triangle {

    private Point first;

    private Point second;

    private Point third;

    public Triangle(Point a, Point b, Point c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public boolean exist(double ab, double ac, double bc) {
        return ((ab + ac > bc) && (ab + bc > ac) && (ac + bc > ab));
    }

    public double area() {
        double rst = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        double p = period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rst = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rst;
    }
}
