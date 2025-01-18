package com.adlitteram.chapter06.ex02;

import java.util.Calendar;

public class Person {
    public String firstName;
    public String lastName;
    public Calendar birthday;

    public String fullName() {
        return firstName + " " + lastName;
    }

    public int age(Calendar today) {
        return today.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
    }
}