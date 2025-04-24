package com.pluralsight;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            File createFile = new File("test.txt");
            if (createFile.createNewFile()) {
                System.out.println("File has Been Created: " + createFile.getName());
            } else {
                System.out.println("File Already Exist");
            }
        } catch (IIOException e) {
            System.out.println("An error is here");
            e.printStackTrace();
        }
    }
}