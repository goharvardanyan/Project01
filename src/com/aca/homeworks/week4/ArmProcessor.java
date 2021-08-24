package com.aca.homeworks.week4;

public class ArmProcessor implements Processor {

    @Override
    public String calculateBinary(long decimal) {
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime <= 1000) {
        }
        return Long.toBinaryString(decimal);
    }
}
