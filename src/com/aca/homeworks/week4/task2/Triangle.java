package com.aca.homeworks.week4.task2;

import java.util.Objects;

// Triangle can't be immutable, because we have to extend a Triangle class
public class Triangle {

    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point a, Point b, Point c) {

        AssertionUtils.assertNotNull(a);
        AssertionUtils.assertNotNull(b);
        AssertionUtils.assertNotNull(c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(Triangle triangle) {
        AssertionUtils.assertNotNull(triangle);
        this.a = triangle.getA();
        this.b = triangle.getB();
        this.c = triangle.getC();
    }

    public static void main(String[] args) {
        Point point1 = new ImmutablePoint(1, 1);
        Point point2 = new ImmutablePoint(2, 2);
        Point point3 = new ImmutablePoint(3, 3);
        Triangle triangle = new Triangle(point1, point2, point3);

        Triangle triangle1 = new Triangle(new ImmutablePoint(1, 1), new ImmutablePoint(2, 9), new ImmutablePoint(3, 3));

        Triangle triangle2 = new Triangle(triangle1);
        System.out.println(triangle2.equals(triangle));
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Triangle)) {
            return false;
        }
        Triangle triangle = (Triangle) object;
        return Objects.equals(triangle.getA(), getA()) &&
                Objects.equals(triangle.getB(), getB()) &&
                Objects.equals(triangle.getC(), getC());
    }

    @Override
    public String toString() {
        return "A: " + getA() + ", B: " + getB() + ", C: " + getC();
    }
}
