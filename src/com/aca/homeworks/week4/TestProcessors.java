package com.aca.homeworks.week4;

public class TestProcessors {

    public static void main(String[] args) {
        Processor processor = new X86IntelProcessor();
        System.out.println(processor.calculateBinary(25884721));
        processor = new X8664IntelProcessor();
        System.out.println(processor.calculateBinary(25884721));
        processor = new ArmProcessor();
        System.out.println(processor.calculateBinary(25884721));
    }
}
