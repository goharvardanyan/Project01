package com.aca.homeworks.week6.safeAndUnsafeCar;

public class SafeCar implements Car {
    private final String[] passengerNames = new String[6];

    private int count = 0;

    @Override
    public synchronized void add(String passengerName) {
        if (count < passengerNames.length) {
            passengerNames[count++] = passengerName;
        }
        System.out.println("There is no space");
    }

    @Override
    public synchronized void printPassengerNames() {
        for (String name : passengerNames) {
            System.out.println(name);
        }
    }
}
