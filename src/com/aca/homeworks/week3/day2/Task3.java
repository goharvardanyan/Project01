package com.aca.homeworks.week3.day2;

public class Task3 {

    public static void main(String[] args) {
        System.out.println(Laptop.getProtectedCount());
        System.out.println(Laptop.getPublicCount());
    }
}

class Laptop {

    private static int protectedCount;
    private static int publicCount;

    public Laptop() {
        publicCount++;
    }

    protected Laptop(int a) {
        protectedCount++;
    }

    public static int getProtectedCount() {
        return protectedCount;
    }

    public static void setProtectedCount(int protectedCount) {
        Laptop.protectedCount = protectedCount;
    }

    public static int getPublicCount() {
        return publicCount;
    }

    public static void setPublicCount(int publicCount) {
        Laptop.publicCount = publicCount;
    }
}

