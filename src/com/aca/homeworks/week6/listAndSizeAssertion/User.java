package com.aca.homeworks.week6.listAndSizeAssertion;

import java.util.Objects;

public class User implements Comparable<User> {
    private final int age;
    private final String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public int compareTo(User o) {
        int result = Integer.compare(getAge(), o.getAge());
        if (result == 0) {
            return getName().compareTo(o.getName());
        }
        return result;
    }
}
