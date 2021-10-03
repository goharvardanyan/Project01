package com.aca.homeworks.week4.task2;

import java.util.Objects;

public final class ImmutablePoint implements Point {

    private final int x;
    private final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public ImmutablePoint(ImmutablePoint point) {
        AssertionUtils.assertNotNull(point);
        this.x = point.getX();
        this.y = point.getY();
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public int getX() {
        return this.x;
    }

    public Point shiftLeft() {
        return new ImmutablePoint(this.x - 1, this.y);
    }
    public Point shiftRight() {
        return new ImmutablePoint(this.x + 1, this.y);
    }
    public Point shiftUp() {
        return new ImmutablePoint(this.x, this.y + 1);
    }
    public Point shiftDown() {
        return new ImmutablePoint(this.x, this.y - 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutablePoint that = (ImmutablePoint) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "x - " + this.getX() + ", y - " + this.getY();
    }

}
