package fr.afpa;

import java.util.Random;

public class GrandHuit {

    public static void justePrix(int number) {
        Random r = new Random();
        int randomNumber = r.nextInt(100);

        if (number > randomNumber) {
            System.out.println("Try a smaller number.");
        }

        if (number < randomNumber) {
            System.out.println("Try a bigger number.");
        }

        if (number == randomNumber) {
            System.out.println("Yayyyy! GG.");
        }
    }

}
