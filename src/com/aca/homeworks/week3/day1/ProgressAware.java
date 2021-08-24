package com.aca.homeworks.week3.day1;

public class ProgressAware {

    private Visibility visibility;

    public void showProgress() {
        this.visibility = Visibility.VISIBLE;
        System.out.println("Progress is visible");
    }

    public void hideProgress() {
        this.visibility = Visibility.INVISIBLE;
        System.out.println("Progress is hidden");
    }

    public boolean isProgressVisible() {
        if (this.visibility == Visibility.VISIBLE) {
            return true;
        }
        return false;
    }

    public void showProgress(int seconds) {
        long startTime = System.currentTimeMillis();
        long currentTime = System.currentTimeMillis();

        while (System.currentTimeMillis() - startTime <= seconds * 1000L) {
            long delta = System.currentTimeMillis() - currentTime;
            if (delta >= 100) {
                currentTime = System.currentTimeMillis();
                int temp = (int) ((System.currentTimeMillis() - startTime) / 100) * 10 / seconds;
                print(temp);
            }
        }


//        long startTime = System.currentTimeMillis();
//        long currentTime = System.currentTimeMillis();
//        long progressTime = startTime;
//        while ((currentTime - startTime) / 1000 <= seconds) {
//            if (currentTime - progressTime >= 1000) {
//                System.out.println(100 * ((currentTime - startTime) / 1000) / seconds + " %");
//                progressTime = currentTime;
//            }
//            currentTime = System.currentTimeMillis();
//        }
    }

    void print(int temp) {
        System.out.println(temp);
    }
}
