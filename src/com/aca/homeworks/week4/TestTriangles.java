package com.aca.homeworks.week4;

public class TestTriangles {

    public static void main(String[] args) {
        Triangle tr = new Triangle(new ImmutablePoint(1, 1), new ImmutablePoint(2, 2), new ImmutablePoint(5, 0));
        ColouredTriangle ctr = new ColouredTriangle(new ImmutablePoint(1, 1),
                new ImmutablePoint(2, 2),
                new ImmutablePoint(5, 0),
                Colour.RED);
        System.out.println(ctr);

        ColouredTriangle ctr2 = new ColouredTriangle(new ImmutablePoint(1, 1),
                new ImmutablePoint(2, 2),
                new ImmutablePoint(5, 0),
                Colour.RED);

        ColouredTriangle ctr3 = new ColouredTriangle(new ImmutablePoint(1, 1),
                new ImmutablePoint(2, 2),
                new ImmutablePoint(4, 0),
                Colour.RED);
        Triangle tr2 = new Triangle(new ImmutablePoint(1, 1), new ImmutablePoint(2, 2), new ImmutablePoint(4, 0));

        if (AssertionUtils.assertNotNull(tr)) {
            System.out.println(tr.equals(ctr));
        }

        if (AssertionUtils.assertNotNull(ctr)) {
            System.out.println(ctr.equals(ctr2));
            System.out.println(ctr.equals(ctr3));
            System.out.println(ctr.equals(tr));
            System.out.println(ctr.equals(tr2));
        }
    }
}
