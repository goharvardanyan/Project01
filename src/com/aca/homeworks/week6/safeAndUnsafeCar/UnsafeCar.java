package com.aca.homeworks.week6.safeAndUnsafeCar;

public class UnsafeCar implements Car {

    private final String[] passengerNames = new String[6];

    private int count = 0;

    @Override
    public void add(String passengerName) {
        if (count < 6) {
            passengerNames[count++] = passengerName;
        }
        System.out.println("There is no space");
    }

    @Override
    public void printPassengerNames() {
        for (String name : passengerNames) {
            System.out.println(name);
        }
    }
}
