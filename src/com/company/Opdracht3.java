package com.company;

import java.util.Scanner;

public class Opdracht3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int random1 = (int) (Math.random() * 12 + 1);
        String maand = "onbekend";
        switch (random1) {
            case 1: maand = "januari"; break;
            case 2: maand = "februari"; break;
            case 3: maand = "maart"; break;
            case 4: maand = "april"; break;
            case 5: maand = "mei"; break;
            case 6: maand = "juni"; break;
            case 7: maand = "juli"; break;
            case 8: maand = "augustus"; break;
            case 9: maand = "september"; break;
            case 10: maand = "oktober"; break;
            case 11: maand = "november"; break;
            case 12: maand = "december"; break;
        }
        System.out.println("Het random getal is " + random1 + " en dat is de maand " + maand + ".");
    }
}
