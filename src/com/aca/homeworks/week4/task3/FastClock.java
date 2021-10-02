package com.aca.homeworks.week4.task3;

public class FastClock implements Clock {
    public static void main(String[] args) {
        new FastClock().start();
    }

    @Override
    public void start() {
        int seconds = 1;
        long currentTime = System.currentTimeMillis();

        while (true) {
            if (System.currentTimeMillis() - currentTime >= 500) {
                currentTime = System.currentTimeMillis();
                System.out.println(seconds++);
            }
        }
    }
}
