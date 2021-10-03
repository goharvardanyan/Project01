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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(a, triangle.a) && Objects.equals(b, triangle.b) && Objects.equals(c, triangle.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public String toString() {
        return "A: " + getA() + ", B: " + getB() + ", C: " + getC();
    }
}
