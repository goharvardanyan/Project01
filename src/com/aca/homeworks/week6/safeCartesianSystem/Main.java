package com.aca.homeworks.week6.safeCartesianSystem;

import com.aca.homeworks.week4.task2.ImmutablePoint;

public class Main {
    public static void main(String[] args) {
        CartesianSystem cartesianSystem = new CartesianSystem();

        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 100; j++) {
                            cartesianSystem.setXY(j, j);
                            ImmutablePoint point = cartesianSystem.getXY();
                            int x = point.getX();
                            int y = point.getY();
                    }
                }
            });
            thread.start();
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
