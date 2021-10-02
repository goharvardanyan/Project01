package com.aca.homeworks.week4.task3;

import com.aca.homeworks.week4.task3.Clock;
import com.aca.homeworks.week4.task3.FastClock;
import com.aca.homeworks.week4.task3.SlowClock;

import java.util.Scanner;

public class TestClock {

    public static void main(String[] args) {
        Clock clock;
        Scanner scanner = new Scanner(System.in);
        System.out.println("if you want to start fastClock , please enter 1, else if SlowClock enter 2");
        String type = scanner.nextLine();
        char[] chars = type.toCharArray();
        if (chars[0] == 49) {
            clock = new FastClock();
            clock.start();
        } else if (chars[0] == 50) {
            clock = new SlowClock();
            clock.start();
        } else throw new RuntimeException();
    }
}
