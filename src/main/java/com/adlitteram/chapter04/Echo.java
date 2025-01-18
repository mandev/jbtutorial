package com.adlitteram.chapter04;

import java.util.ArrayList;
import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> memory = new ArrayList<String>();

        while (true) {
            memory.add(reader.nextLine());

            if ((memory.get(memory.size() - 1)).equals("CLEAR")) {
                memory.clear();
            } else {
                if ((memory.get(memory.size() - 1)).equals("END"))
                    break;
            }

            System.out.println(memory.toString());
        }
    }
}