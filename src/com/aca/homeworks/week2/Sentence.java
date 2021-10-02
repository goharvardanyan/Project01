package com.aca.homeworks.week2;

public class Sentence {

    private String[] words = new String[5];
    private int count;

    public void append(String word) {
        if (count == this.words.length) {
            System.out.println("You can't add a word");
            return;
        }
        words[count] = word;
        count++;
    }

    public String getValue() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count - 1; i++) {
            sb.append(this.words[i]).append(" ");
        }
        sb.append(this.words[count - 1]);
        return sb.toString();
    }

    public int getWordsCount() {
        return this.count;
    }
}

