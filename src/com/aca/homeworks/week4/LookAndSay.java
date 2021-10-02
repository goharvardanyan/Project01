package com.aca.homeworks.week4;

public class LookAndSay {
    public String lookAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        if (n == 2) {
            return "11";
        }
        char[] chars = new char[]{'1','1'};
        for (int i = 3; i <= n; i++) {
            int count = 0;
            char ch = chars[0];
            StringBuilder tempSb = new StringBuilder();
            char previousChar = ch;
            for (int j = 0; j < chars.length; j++) {
                ch = chars[j];
                if (previousChar == ch) {
                    count++;

                } else {
                    tempSb.append(count).append(previousChar);
                    count = 1;
                }
                if (j == chars.length - 1) {
                    tempSb.append(count).append(ch);
                }
                previousChar = ch;
            }
            chars = tempSb.toString().toCharArray();
        }
        return new String(chars);
    }
}
