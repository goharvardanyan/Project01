package com.aca.homeworks.week3.day1;

public class CircleProgressAware extends ProgressAware {

    @Override
    void print(int temp) {
        System.out.println((360 * temp / 100) + " degrees");
    }
}
