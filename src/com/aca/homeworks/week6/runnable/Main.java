package com.aca.homeworks.week6.runnable;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:/Users/Gevorg/Desktop/file10.txt");
        Thread thread = new Thread(new RunnableImpl(file));
        thread.start();
    }
}
