package com.aca.homeworks.week4.task3;

import com.aca.homeworks.week4.task3.Processor;

public class X8664IntelProcessor implements Processor {

    @Override
    public String calculateBinary(long decimal) {
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime <= 2000) {
        }
        return Long.toBinaryString(decimal);
    }
}
