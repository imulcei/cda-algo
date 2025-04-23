package fr.afpa;

import java.util.Random;
import java.util.Scanner;

public class Mastermind {

    public static void main(String[] args) {
        mastermind();
    }

    public static void mastermind() {

        // l'ordinateur choisit un nombre aléatoire
        Random r = new Random();
        int randomNumberComputer = r.nextInt(9999);

        // demande au joueur d'entrée un nombre
        System.out.println("Veuillez entrer un nombre.");
        // le joueur entre un chiffre
        int playerInput = playerInput();
        System.out.println(playerInput);
        if (playerInput > 7777 || playerInput < (int) (Math.log10(playerInput) + 1)) {
            System.out.println("Veuillez entrer un nombre entre 0000 et 7777.");
        }
    }

    public static int playerInput() {
        int input;
        Scanner playerInput = new Scanner(System.in);
        input = playerInput.nextInt();
        playerInput.close();
        return input;
    }

}
