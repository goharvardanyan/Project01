package com.aca.homeworks.week6.numbersGeneratorAndPrinter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumbersGeneratorAndPrinter {

    public static void main(String[] args) {
        List<Integer> integerList = sequentialIntegers(10);
        List<Double> doubleList = randomDoubles(10);
        print(integerList);
        print(doubleList);
    }


    public static List<Integer> sequentialIntegers(int count) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
        return list;
    }

    public static List<Double> randomDoubles(int count) {
        List<Double> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            list.add(random.nextDouble() * random.nextInt(2000));
        }
        return list;
    }

    public static void print(List<? extends Number> list) {
        for (int i = 0; i < list.size(); i++) {
            Number n = list.get(i);
            System.out.println((n.doubleValue() * 2));
        }
    }
}
