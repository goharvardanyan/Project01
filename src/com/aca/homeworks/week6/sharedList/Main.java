package com.aca.homeworks.week6.sharedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> sharedList = new ArrayList<>();
        List<Thread> threadList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            threadList.add(new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 1; j <= 500; j++) {
                        synchronized (Main.class) {
                            sharedList.add(j);
                        }
                    }
                }
            }));
            threadList.get(i).start();
        }

        for (int i = 0; i < threadList.size(); i++) {
            threadList.get(i).join();
        }
        System.out.println(sharedList.size());
    }
}
