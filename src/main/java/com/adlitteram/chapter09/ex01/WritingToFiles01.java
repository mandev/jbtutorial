package com.adlitteram.chapter09.ex01;

public class WritingToFiles01 {
    public static void main(String[] args) {
        for (long number : FibonacciNumbers()) {
            System.out.println(number);
        }
    }

    private static long[] FibonacciNumbers() {
        long[] fibNumbers = new long[50];
        fibNumbers[0] = 0;
        fibNumbers[1] = 1;
        for (int i = 2; i < 50; i++) {
            fibNumbers[i] = fibNumbers[i - 1] + fibNumbers[i - 2];
        }
        return fibNumbers;
    }
}