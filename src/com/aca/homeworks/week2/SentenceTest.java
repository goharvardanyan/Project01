package com.aca.homeworks.week2;

public class SentenceTest {

    public static void main(String[] args) {
        Sentence sentence = new Sentence();
        sentence.append("today");
        sentence.append("is");
        System.out.println(sentence.getWordsCount());
        sentence.append("a");
        sentence.append("good");
        sentence.append("day");
        System.out.println(sentence.getValue());
        sentence.append("sunshine");
        System.out.println(sentence.getWordsCount());
    }
}
