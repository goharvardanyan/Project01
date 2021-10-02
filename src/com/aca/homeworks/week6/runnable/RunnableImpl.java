package com.aca.homeworks.week6.runnable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

public class RunnableImpl implements Runnable {

    private final File file;

    public RunnableImpl(File file) {
        this.file = file;
    }

    @Override
    public void run() {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Random random = new Random();
        if (printWriter != null) {
            for (int i = 0; i < 10000; i++) {
                printWriter.println("random " + random.nextInt(10000));
            }
            printWriter.close();
        } else throw new NullPointerException();

    }
}
