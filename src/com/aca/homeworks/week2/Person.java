package com.aca.homeworks.week2;

public class Person {

    private long millisOfBirth;
    private String name;

    public void setMillisOfBirth(long millisOfBirth) {
        if (millisOfBirth == 0 || millisOfBirth > 51 * getMillisOfYear() || millisOfBirth < getMillisOfYear()) {
            System.out.println("Wrong input");
            return;
        }
        if (this.millisOfBirth != 0) {
            System.out.println("Person already has date of birth");
            return;
        }
        this.millisOfBirth = millisOfBirth;
    }

    public int getAge() {
        if (this.millisOfBirth == 0) {
            System.out.println("Person does not have millisOfBirth");
            return 0;
        }
        long ageWithMillis = System.currentTimeMillis() - millisOfBirth;
        return (int) (ageWithMillis / getMillisOfYear());
    }

    private long getMillisOfYear() {
        return 365 * 24 * 60 * 60 * 1000L;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
