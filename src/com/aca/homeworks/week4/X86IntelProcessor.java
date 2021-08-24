package com.aca.homeworks.week4;

public class X86IntelProcessor implements Processor {

    @Override
    public String calculateBinary(long decimal) {
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime <= 4000) {
        }
        return Long.toBinaryString(decimal);
    }
}
