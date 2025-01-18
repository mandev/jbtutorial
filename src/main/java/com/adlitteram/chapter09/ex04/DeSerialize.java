package com.adlitteram.chapter09.ex04;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialize {
    public static void main(String argv[]) {
        Car c = null;

        try {
            FileInputStream inFile = new FileInputStream("serialized.dat");
            ObjectInputStream in = new ObjectInputStream(inFile);
            c = (Car) in.readObject();
            in.close();
            inFile.close();
        } catch (IOException e) {
            System.err.println("ERROR");
        } catch (ClassNotFoundException e) {
            System.err.println("ERROR");
        }

        System.out.println(c.toString());
    }
}