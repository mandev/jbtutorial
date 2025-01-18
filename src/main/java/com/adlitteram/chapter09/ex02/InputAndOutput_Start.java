package com.adlitteram.chapter09.ex02;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputAndOutput_Start {
    public static void main(String[] args) throws IOException {
        File outFile = new File("OutputFile.txt");
        File inFile = new File("InputFile.txt");

        FileWriter out = new FileWriter(outFile);
        FileReader in = new FileReader(inFile);

        //Code Here...

        out.close();
        in.close();
    }
}