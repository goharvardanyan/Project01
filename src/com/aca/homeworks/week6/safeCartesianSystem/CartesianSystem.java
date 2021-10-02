package com.aca.homeworks.week6.safeCartesianSystem;


import com.aca.homeworks.week4.task2.ImmutablePoint;
import com.aca.homeworks.week4.task2.Point;

public class CartesianSystem {
    private int x = 0;
    private int y = 0;

    public synchronized void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public synchronized ImmutablePoint getXY() {
        return new ImmutablePoint(this.x, this.y);
    }
}

