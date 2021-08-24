package com.aca.homeworks.week4.task2;

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
    public boolean equals(Object object) {
        if (object == this){
            return true;
        }
        if (!(object instanceof ImmutablePoint)) {
            return false;
        }
        ImmutablePoint point = (ImmutablePoint) object;
        return x == point.getX() &&
                y == point.getY();
    }

    @Override
    public String toString() {
        return "x - " + this.getX() + ", y - " + this.getY();
    }


}
