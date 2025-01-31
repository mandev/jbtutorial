package com.adlitteram.chapter05.ex01;

import java.util.Scanner;

// F to C: ((t-32.0f)*5.0f)/9.0f
// C to K: t+273.15f
// K to F: (((t-273.15f)*9.0f)/5.0f)+32.0f

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        char inputType;
        char outputType;
        float inputValue;
        float returnValue;

        System.out.print("Input type (F/C/K): ");
        inputType = reader.next().charAt(0);
        System.out.print("Output type (F/C/K): ");
        outputType = reader.next().charAt(0);
        System.out.print("Temperature: ");
        inputValue = reader.nextFloat();
    }
}