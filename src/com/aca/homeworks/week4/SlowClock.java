package com.aca.homeworks.week4;

public class SlowClock implements Clock {
    public static void main(String[] args) {
        new SlowClock().start();
    }

    @Override
    public void start() {
        int second = 1;
        long currentTime = System.currentTimeMillis();

        while (true) {
            if (System.currentTimeMillis() - currentTime >= 2000) {
                currentTime = System.currentTimeMillis();
                System.out.println(second++);
            }
        }
    }
}
