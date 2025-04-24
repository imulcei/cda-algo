package fr.afpa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mastermind {

    public static void main(String[] args) {
        mastermind();
    }

    public static void mastermind() {

        // l'ordinateur choisit un nombre aléatoire
        int[] computerInput = computerChoice();
        System.out.println(Arrays.toString(computerInput));

        // int[] playerInput = playerInput();
        // System.out.println(Arrays.toString(playerInput));

        // boucle de jeu
        boolean isCorrect = false;
        int tentatives = 0;
        int counterNumberOk = 0;
        int counterNumberAlmostOk = 0;
        boolean[] usedIndexComputer = new boolean[4];
        boolean[] usedIndexPlayer = new boolean[4];

        while (!isCorrect && tentatives < 8) {
            // on réinitialise les counters
            counterNumberOk = 0;
            counterNumberAlmostOk = 0;

            // demande au joueur d'entrer un nombre
            // nouvel essai du joueur si pas le bon nombre
            int[] playerInput = playerInput();
            System.out.println(Arrays.toString(playerInput));

            // on compare computerInput et playerInput
            for (int i = 0; i < 4; i++) {
                if (computerInput[i] == playerInput[i]) {
                    // System.out.println("Chiffre bien placé : " + i);
                    usedIndexComputer[i] = true;
                    usedIndexPlayer[i] = true;
                    counterNumberOk++;
                }
                for (int j = 0; j < 4; j++) {
                    if (computerInput[i] == playerInput[j] && i != j) {
                        // System.out.println("Chiffre présent mais mal placé");
                        counterNumberAlmostOk++;
                    }
                }
            }

            System.out.println("Chiffre bien placé: " + counterNumberOk + ". Chiffre présent mais mal placés: "
                    + counterNumberAlmostOk);

            // vérifie la victoire du joueur
            if (counterNumberOk == 4) {
                isCorrect = true;
                System.out.println("Victoire !");
            }

            tentatives++;
        }
    }

    /**
     * 
     * @return Renvoie le nombre aléatoire de 4 chiffres entre 0 et 7 à deviner
     */
    public static int[] computerChoice() {
        int[] numbersToGuess = new int[4];
        int i = 0;
        while (i < 4) {
            Random r = new Random();
            int randomNumberComputer = r.nextInt(7);
            numbersToGuess[i] += randomNumberComputer;
            i++;
        }
        return numbersToGuess;
    }

    /**
     * 
     * @return Renvoie le nombre de 4 chiffres entre 0 et 7 choisi par l'utilisateur
     */
    public static int[] playerInput() {
        boolean isValid = false;
        int[] playerInput = new int[4];
        Scanner scanner = new Scanner(System.in);

        while (!isValid) {
            System.out.println("Choisir 4 chiffres entre 0 et 7.");
            String playerNumber = scanner.nextLine();

            if (playerNumber.length() != 4) {
                System.out.println("Erreur: il faut entrer exactement 4 chiffres.");
                continue;
            }

            isValid = true;
            for (int i = 0; i < 4; i++) {
                char c = playerNumber.charAt(i);
                if (!Character.isDigit(c) || c < '0' || c > '7') {
                    isValid = false;
                    System.out.println("Erreur: chaque chiffre doit être entre 0 et 7.");
                }
            }

            if (isValid) {
                for (int i = 0; i < 4; i++) {
                    playerInput[i] = Character.getNumericValue(playerNumber.charAt(i));
                }
            }
        }

        return playerInput;
    }

}
