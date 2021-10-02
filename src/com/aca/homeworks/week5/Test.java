package com.aca.homeworks.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        ArrayList<String> l = new ArrayList<>();
        CustomArrayList<String> list= new CustomArrayList<>();
        list.addFirst("a");
        list.addLast("b");
        list.add(0, "c");
        System.out.println(list.indexOf("b"));
        Comparator<String> s = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        list.bubbleSort(s);

//        System.out.println(list.remove(0));
//        System.out.println(list.remove("b"));


        System.out.println(list);
    }
}
