package com.aca.homeworks.week3.day2;

public class Task5 {

    public static void main(String[] args) {
        System.out.println(Months.getMonth(12));
    }

}

enum Months {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Months getMonth(int index) {
        if (index > 12 || index < 1) {
            throw new RuntimeException();
        }
        Months[] months = Months.values();
        return months[index - 1];
    }
}
