package com.adlitteram.chapter03;

import java.util.Scanner;

public class IntroToLoops {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String input;
        String all = "";

        do {
            input = reader.nextLine();
            all += input;
        } while (!input.equals("STOP"));

        System.out.println(all);
    }
}