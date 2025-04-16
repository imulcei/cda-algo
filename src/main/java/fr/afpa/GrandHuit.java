package fr.afpa;

import java.util.Random;

public class GrandHuit {

    // TODO difiicile d'automatiser le test d'une telle fonction (vu que l'intérêt réside dans la saisie utilisateur)
    // dans ce cas mieux vaut mettre en place une fonction "main" qui appelle justePrix et intégrer des scanners
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
