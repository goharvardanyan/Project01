package com.aca.homeworks.week6.fileGeneratorRunnable;

import com.aca.homeworks.week6.runnable.RunnableImpl;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 10; i++) {
            String path = "C:/Users/Gevorg/Desktop/file" + i + ".txt";
            File currentFile = new File(path);
            new Thread(new RunnableImpl(currentFile)).start();
        }
    }
}