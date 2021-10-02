package com.aca.homeworks.week6.listAndSizeAssertion;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "user1");
        User user2 = new User(2, "user2");
        User user3 = new User(3, "user3");
        User user4 = new User(2, "user2");
        User user5 = new User(2, "user2");


        List<User> arrayList = new ArrayList() {{
            add(user1);
            add(user2);
            add(user3);
            add(user4);
            add(user5);
        }};
        List<User> linkedList = new LinkedList() {{
            add(user1);
            add(user2);
            add(user3);
            add(user4);
            add(user5);
        }};
        Set<User> hashSet = new HashSet() {{
            add(user1);
            add(user2);
            add(user3);
            add(user4);
            add(user5);
        }};
        Set<User> treeSet = new TreeSet() {{
            add(user1);
            add(user2);
            add(user3);
            add(user4);
            add(user5);
        }};

        AssertionUtil.assertSizeEquals5(arrayList);
        AssertionUtil.assertSizeEquals5(linkedList);
        AssertionUtil.assertSizeEquals3(hashSet);
        AssertionUtil.assertSizeEquals3(treeSet);
        System.out.println(arrayList.size() + " " + linkedList.size() + " " + hashSet.size() + " " + treeSet.size());


    }
}

class AssertionUtil {
    public static void assertSizeEquals5(List<User> users) {
        if (users.size() != 5) {
            throw new RuntimeException("Size should be 5");
        }
    }

    public static void assertSizeEquals3(Set<User> users) {
        if (users.size() != 3) {
            throw new RuntimeException("SIze should be 3");
        }
    }
}
