package com.aca.homeworks.week3.day2;

public class Task6 {

}
interface Animal {

    void isBreathing();
}

interface LandAnimal extends Animal {
    void isRunning();
}

interface WaterAnimal extends Animal {
    void isSwimming();
}

class Frog implements LandAnimal, WaterAnimal {

    @Override
    public void isBreathing() {
        System.out.println("Frog is breathing");
    }

    @Override
    public void isRunning() {
        System.out.println("Frog is running");
    }

    @Override
    public void isSwimming() {
        System.out.println("Frog is swimming");
    }
}

class Cat implements LandAnimal{

    @Override
    public void isBreathing() {
        System.out.println("Cat is breathing");
    }

    @Override
    public void isRunning() {
        System.out.println("Cat is running");
    }
}


class Dolphin implements WaterAnimal {

    @Override
    public void isBreathing() {
        System.out.println("Dolphin is breathing");
    }

    @Override
    public void isSwimming() {
        System.out.println("Dolphin is swimming");
    }
}
