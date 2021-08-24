package com.aca.homeworks.week4;

public class Printer {

    public static void main(String[] args) {
        User user1 = new User("A", "AL", "Akjh", "aaa");
        User user2 = new User("B", "BL", "bghj", "bbb");
        specialPrint(user1);
        UserGroup userGroup = new UserGroup();
        userGroup.addUser(user1);
        userGroup.addUser(user2);

        specialPrint(userGroup);
        ImmutablePoint immutablePoint = new ImmutablePoint(1,2);
        specialPrint(immutablePoint);

        Triangle triangle = new Triangle(immutablePoint, new ImmutablePoint(3,3), new ImmutablePoint(7,1));
        specialPrint(triangle);

        ColouredTriangle colouredTriangle = new ColouredTriangle(immutablePoint, new ImmutablePoint(4,4),new ImmutablePoint(5,2), Colour.BLUE);
        specialPrint(colouredTriangle);
    }

    public static void specialPrint(Object object) {
        System.out.println("    *************************    ");
        System.out.println(object.toString());
        System.out.println("    *************************    ");
    }
}
