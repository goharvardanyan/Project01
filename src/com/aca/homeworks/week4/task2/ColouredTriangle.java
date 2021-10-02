package com.aca.homeworks.week4.task2;

import java.util.Objects;

public class ColouredTriangle extends Triangle {

    private final Colour colour;

    public ColouredTriangle(Point a, Point b, Point c, Colour colour) {
        super(a, b, c);
        this.colour = colour;
    }

    public Colour getColour() {
        return colour;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Triangle)) {
            return false;
        }
        if (object instanceof ColouredTriangle) {
            ColouredTriangle triangle = (ColouredTriangle) object;
            return super.equals(triangle) && Objects.equals(this.colour, triangle.getColour());
        }
        Triangle triangle = (Triangle) object;
        return super.equals(triangle);
    }

    @Override
    public String toString() {
        return super.toString() + ", Colour- " + colour.toString();
    }

}
