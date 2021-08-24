package com.aca.homeworks.week3.day2;

interface Book {

    void open();

    void close();

    void browsePages();

}

public class Task7 {
}

class PaperBook implements Book {

    private final String author;
    private final String genre;
    private final int numberOfPages;
    private boolean isOpened;
    private int currentPage;

    public PaperBook(String author, String genre, int numberOfPages) {
        this.author = author;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void open() {
        this.isOpened = true;
    }

    @Override
    public void close() {
        this.isOpened = false;
    }

    @Override
    public void browsePages() {
        if (currentPage < numberOfPages) {
            this.currentPage++;
        } else {
            System.out.println("The End");
        }
    }
}

class EBook implements Book {
    private final String author;
    private final String genre;
    private final int numberOfPages;
    private final float sizeInMBs;
    private boolean isOpened;
    private int currentPage;

    public EBook(String author, String genre, int numberOfPages, float sizeInMBs) {
        this.author = author;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
        this.sizeInMBs = sizeInMBs;
    }

    @Override
    public void open() {
        this.isOpened = true;
    }

    @Override
    public void close() {
        this.isOpened = false;
    }

    @Override
    public void browsePages() {
        if (currentPage < numberOfPages) {
            this.currentPage++;
        } else {
            System.out.println("The End");
        }
    }
}


