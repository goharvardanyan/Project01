package com.aca.homeworks.week3.day2;

public class Task9 {
}

interface Shape {
    double calculateArea();
    String getName();
}

class Rectangle implements Shape {
    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}

class Square implements Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}

class Circle implements Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.pow(Math.PI * radius, 2);
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}

 class RightTriangle implements Shape {
    private final double a;
    private final double b;
    private final double c;

     public RightTriangle(double a, double b, double c) {
         this.a = a;
         this.b = b;
         this.c = c;
     }

     @Override
     public double calculateArea() {
         return a * b * c / 2;
     }

     @Override
     public String getName() {
         return getClass().getSimpleName();
     }
 }
