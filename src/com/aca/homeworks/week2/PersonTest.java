package com.aca.homeworks.week2;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Person1");
        person1.setMillisOfBirth(30 * (24 * 60 * 60 * 365 * 1000L));
        System.out.println(person1.getAge());
        person1.setMillisOfBirth(25 * (24 * 60 * 60 * 365 * 1000L));
        System.out.println(person1.getAge());



    }
}
//    Sentence sentence = new Sentence();
//        sentence.append("Today");
//                sentence.append("is");
//                sentence.append("a");
//                sentence.append("good");
//                sentence.append("day");
//                sentence.append("arev");
//                System.out.println(sentence.getValue());
//                System.out.println(sentence.getWordsCount());