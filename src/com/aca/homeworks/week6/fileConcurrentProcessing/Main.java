package com.aca.homeworks.week6.fileConcurrentProcessing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            final int j = i;
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    BufferedReader bufferedReader = null;
                    try {
                        bufferedReader = new BufferedReader(new FileReader("C:/Users/Gevorg/Desktop/file" + j + ".txt"));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    if (bufferedReader != null) {
                        long count = bufferedReader
                                .lines()
                                .filter(line -> line.contains("99"))
                                .count();
                        System.out.println("file" + j + ".txt " + count);
                    } else throw new NullPointerException();

                }
            });
            thread.start();
            list.add(thread);
        }
        for (Thread t: list) {
            try {
                t.join();
            } catch (InterruptedException e) {
            }
        }
    }
}
