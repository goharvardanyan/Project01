package com.aca.homeworks.week3.day2;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        Integer negativeNumber = -1 * randomNumber.nextInt();
        System.out.println(negativeNumber);
        System.out.println(abs(negativeNumber));
    }

    public static int abs(Integer number) {
        return Math.abs(number);
    }
}
