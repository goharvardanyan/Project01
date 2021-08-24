package com.aca.homeworks.week4.task1;

import java.util.Arrays;

public class UserGroup implements Cloneable{

    private final User[] users = new User[10];
    private int index = 0;

    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("a", "b", "c", "d");
        User user2 = new User(user);
        System.out.println(user + "" + user2);
        System.out.println(user.equals(user2));
        User user3 = new User("e", "t", "y", "u");
        User user4 = new User(user3);
        UserGroup userGroup = new UserGroup();
        userGroup.addUser(user);
        userGroup.addUser(user2);
        userGroup.addUser(user3);
        userGroup.addUser(user4);
        System.out.println(userGroup);
        UserGroup clonesUserGroup = userGroup.clone();
        System.out.println(Arrays.toString(clonesUserGroup.users));
        System.out.println(userGroup.users[0] == clonesUserGroup.users[0]);
    }

    public void addUser(User user) {
        if (index == 10) {
            throw new RuntimeException("Users array is full");
        }

        this.users[index++] = new User(user);
    }

    @Override
    public UserGroup clone() throws CloneNotSupportedException {
        UserGroup userGroup = (UserGroup) super.clone();
//        userGroup = new UserGroup();
        for (int i = 0; i < users.length; i++) {
            if (this.users[i] != null) {
                userGroup.users[i] = this.users[i].copy();
            }
        }
//        userGroup.setIndex(this.getIndex());
        return userGroup;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < index; i++) {
            sb.append(users[i].toString()).append(", ");

        }
        return "UserGroup{" +
                "users=" + sb +
                '}';
    }

    public User[] getUsers() {
        return users;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
