package com.aca.homeworks.week3.day1;

public class Test {

    public static void main(String[] args) {

        ProgressAware progressAware = new ProgressAware();
        progressAware.showProgress(10);
        LineProgressAware lineProgressAware = new LineProgressAware(500);
        lineProgressAware.showProgress(10);
        CircleProgressAware circleProgressAware = new CircleProgressAware();
        circleProgressAware.showProgress(10);
        ImageLoader imageLoader = new ImageLoader();
        imageLoader.load();
        imageLoader.load();

        LinkedIntBuffer linkedIntBuffer = new LinkedIntBuffer(1);
        LinkedIntBuffer linkedIntBuffer1 = new LinkedIntBuffer(3);
        LinkedIntBuffer linkedIntBuffer2 = new LinkedIntBuffer(2);
        linkedIntBuffer.setNext(linkedIntBuffer1);
        linkedIntBuffer1.setNext(linkedIntBuffer2);
        System.out.println(linkedIntBuffer);
    }
}
