package com.company;

import java.util.Scanner;

public class Opdracht2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int random1 = (int) (Math.random() * 10 + 1);
        int random2 = (int) (Math.random() * 10 + 1);
        int random3 = (int) (Math.random() * 10 + 1);
        System.out.println("Wat is " + random1 + " x " + random2 + " x " + random3  + " ? ");
        int userInput = scanner.nextInt();
        int uitkomst = random1 * random2 * random3;
        if (userInput == uitkomst) {
            System.out.println("Helemaal goed!");
        }   else {
            System.out.println("Helaas, het juiste antwoord was " + uitkomst);
        }
    }
}
