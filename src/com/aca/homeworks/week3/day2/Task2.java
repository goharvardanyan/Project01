package com.aca.homeworks.week3.day2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        System.out.println(getPi());
    }

    public static double getPi() {
        List<Double> list = new ArrayList<>();
        list.add(Math.PI);
        double pi = list.get(0);
        return pi;
    }
}
