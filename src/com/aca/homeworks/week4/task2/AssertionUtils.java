package com.aca.homeworks.week4.task2;

public class AssertionUtils {

    public static boolean assertEquals(int val1, int val2) {
        if (val1 == val2) {
            return true;
        }
        throw new RuntimeException("Aren't equals");
    }

    public static boolean assertEquals(double val1, double val2) {
        if (val1 == val2) {
            return true;
        }
        throw new RuntimeException("Aren't equals");
    }

    public static boolean assertEquals(String val1, String val2) {
        if (val1.equals(val2)) {
            return true;
        }
        throw new RuntimeException("Aren't equals");
    }

    public static boolean assertEquals(boolean val1, boolean val2) {
        if (val1 == val2) {
            return true;
        }
        throw new RuntimeException("Aren't equals");
    }

    public static boolean assertNotNull(Object obj) {
        if (obj != null) {
            return true;
        }
        throw new RuntimeException("Input argument is null");
    }
}
