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
        int randomNumberComputer = r.nextInt(7777);

        // demande au joueur d'entrer un nombre
        int playerInput = playerInput();
        System.out.println(playerInput);

    }

    public static int playerInput() {
        int input = 0;
        String inputStr;
        Scanner playerInput = new Scanner(System.in);
        boolean isValid = true;
        while (isValid) {
            System.out.println("Veuillez entrer un nombre entre 0000 et 7777.");
            inputStr = playerInput.nextLine();
            if (inputStr.matches("\\d{4}")) {
                input = Integer.parseInt(inputStr);
                if (input <= 7777) {
                    isValid = false;
                    System.out.println("Entrée invalide.");
                }
            } else {
                System.out.println("Entrée invalide.");
            }
        }
        playerInput.close();
        return input;
    }

}
