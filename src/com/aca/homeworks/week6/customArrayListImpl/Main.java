package com.aca.homeworks.week6.customArrayListImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        SimpleList<Integer> unsafeList = new UnsafeSimpleList<>();
        SimpleList<Integer> safeList = new SafeSimpleList<>();
        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            threadList.add(new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 1; j <= 500; j++) {
                        unsafeList.add(j);
                        safeList.add(j);
                    }
                }
            }));
            threadList.get(i).start();
        }

        for (int i = 0; i < 20; i++) {
            threadList.get(i).join();
        }
        System.out.println(unsafeList.getSize());
        System.out.println(safeList.getSize());
    }
}
