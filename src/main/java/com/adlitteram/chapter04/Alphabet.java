package com.adlitteram.chapter04;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        //97
        char[] alpha = new char[26];

        for (int i = 0; i < 26; i++) {
            alpha[i] = (char) (97 + i);
        }

        System.out.println(Arrays.toString(alpha));
    }
}