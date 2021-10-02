package com.aca.homeworks.week3.day1;

public class LineProgressAware extends ProgressAware {

    private int lineWidth;

    public LineProgressAware() {
    }

    public LineProgressAware(int lineWidth) {
        if (lineWidth <= 0) {
            throw new RuntimeException();
        }
        this.lineWidth = lineWidth;
    }

    @Override
    void print(int temp) {
        System.out.println((temp * this.lineWidth / 100) + " current line length is " + this.lineWidth);
    }
}
