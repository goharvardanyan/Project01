package com.aca.homeworks.week3.day2;

public class Task4 {

    public static void main(String[] args) {
        Directions direction = Directions.EAST;
        direction.printValues();
    }
}

enum Directions {
    EAST(1),
    WEST(2),
    SOUTH(3),
    NORTH(4);

    private final int value;

    Directions(int value) {
        this.value = value;
    }

    public void printValues() {
        for (Directions direction : Directions.values()) {
            System.out.println(direction);
        }
    }
}
