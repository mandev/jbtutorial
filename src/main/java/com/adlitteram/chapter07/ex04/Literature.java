package com.adlitteram.chapter07.ex04;

public abstract class Literature {
    protected String title;
    protected String author;

    public void Print() {
        System.out.println(title);
        System.out.println("\tWritten By: " + author);
    }
}
