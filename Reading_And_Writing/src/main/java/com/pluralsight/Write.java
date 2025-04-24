package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("test2Write.txt");
            myWriter.write("Just Testing!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}