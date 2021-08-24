package com.aca.homeworks.week3.day2;

interface Staff {
    void work();
}

public class Task8 {

    public static void main(String[] args) {
        Staff staff = new Pianist();
        staff.work();
        staff = new Violinist();
        staff.work();
    }
}

class Pianist implements Staff {

    @Override
    public void work() {
        System.out.println("Plays piano");
    }
}

class Violinist implements Staff {

    @Override
    public void work() {
        System.out.println("Plays violin");
    }
}