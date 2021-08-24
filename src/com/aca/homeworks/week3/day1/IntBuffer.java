package com.aca.homeworks.week3.day1;

public class IntBuffer {

    private Integer value;

    public IntBuffer(int value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
