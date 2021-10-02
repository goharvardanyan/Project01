package com.aca.homeworks.week3.day1;

public class ImageLoader extends LineProgressAware {

    private boolean isLoadedImage;

    public void load() {
        if (isLoaded()) {
            System.out.println("Image is already loaded");
            return;
        }
        ProgressAware p = new ProgressAware();
        p.showProgress(5);
        this.isLoadedImage = true;
    }

    public boolean isLoaded() {
        return this.isLoadedImage;
    }
}
