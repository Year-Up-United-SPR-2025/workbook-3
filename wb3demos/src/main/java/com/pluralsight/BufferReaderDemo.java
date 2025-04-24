package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {
    public static void main(String[] args) {

        FileReader fr = null;
        try {
            fr = new FileReader("Mario-RPG's-List.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        BufferedReader br = new BufferedReader(fr);

        String currentLine;
        while (true){
            try {
                if (!((currentLine = br.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(currentLine);
        }

        try {
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
