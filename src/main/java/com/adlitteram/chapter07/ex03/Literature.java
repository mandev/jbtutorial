package com.adlitteram.chapter07.ex03;

public class Literature {
    protected String title;
    protected String author;

    public Literature(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void Print() {
        System.out.println(title);
        System.out.println("\tWritten By: " + author);
    }
}
