package com.pluralsight;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> quotes = new ArrayList<>();
        quotes.add("Frankly, my dear, I don't give a damn. — Gone with the Wind (1939)");
        quotes.add("I'm going to make him an offer he can't refuse. — The Godfather (1972)");
        quotes.add("Here's looking at you, kid. — Casablanca (1942)");
        quotes.add("May the Force be with you. — Star Wars (1977)");
        quotes.add("You can't handle the truth! — A Few Good Men (1992)");
        quotes.add("I'll be back. — The Terminator (1984)");
        quotes.add("Life is like a box of chocolates. You never know what you're gonna get. — Forrest Gump (1994)");
        quotes.add("Why so serious? — The Dark Knight (2008)");
        quotes.add("To infinity and beyond! — Toy Story (1995)");
        quotes.add("Say hello to my little friend! — Scarface (1983)");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number between 1 - 10: \n");

        int choice = scanner.nextInt();
        System.out.println("Quote: " + quotes.get(choice - 1));

    }
}