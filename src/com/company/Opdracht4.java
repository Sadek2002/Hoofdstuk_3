package com.company;

import java.sql.Struct;
import java.util.Scanner;

public class Opdracht4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welke weekdag is het nu? ( 1 = Ma / 2 = Di / 3 = Wo / 4 = Do / 5 = Vr / 6 = Za / 7 = Zo )");
        int dagen = scanner.nextInt();
        System.out.println("En van hoeveel dagen in de toekomst wil je de weekdag berekenen?");
        int dagenVooruit = scanner.nextInt();
        int resultaat = dagen + dagenVooruit;
        if (resultaat > 7) {
            resultaat = resultaat % 7;
        }
        String[] weekdagen = {"onbekent","maandag","dinsdag","woensdag","donderdag","vrijdag","zaterdag","zondag"};
        System.out.println("Vandaag is het " + weekdagen[dagen] + " en over " + dagenVooruit + " dagen is het " + weekdagen[resultaat]);
        }
    }

