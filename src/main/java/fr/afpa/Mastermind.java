package fr.afpa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mastermind {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mastermind(scanner);
        scanner.close();
    }

    /**
     * La fonction sert à jouer au Mastermind face à l'ordinateur
     * 
     * @param scanner Les essais du joueur
     */
    public static void mastermind(Scanner scanner) {

        // l'ordinateur choisit un nombre aléatoire
        int[] computerInput = computerChoice();
        System.out.println(Arrays.toString(computerInput));

        // boucle de jeu
        boolean isCorrect = false;
        int tentatives = 0;

        while (!isCorrect && tentatives < 8) {
            // demande au joueur d'entrer un nombre
            // nouvel essai du joueur si pas le bon nombre
            int[] playerInput = playerInput(scanner);
            System.out.println(Arrays.toString(playerInput));

            int counterNumberOk = 0;
            int counterNumberAlmostOk = 0;
            boolean[] usedIndexComputer = new boolean[4];
            boolean[] usedIndexPlayer = new boolean[4];

            // on compare computerInput et playerInput
            // chiffres bien placés
            for (int i = 0; i < 4; i++) {
                if (computerInput[i] == playerInput[i]) {
                    usedIndexComputer[i] = true;
                    usedIndexPlayer[i] = true;
                    counterNumberOk++;
                }
            }

            // chiffres présents mais mal placés
            for (int i = 0; i < 4; i++) {
                if (usedIndexComputer[i]) {
                    continue;
                }
                for (int j = 0; j < 4; j++) {
                    if (computerInput[i] == playerInput[j] && !usedIndexPlayer[j]) {
                        usedIndexComputer[i] = true;
                        usedIndexPlayer[j] = true;
                        counterNumberAlmostOk++;
                        break;
                    }
                }
            }

            System.out.println("Chiffres bien placés: " + counterNumberOk + ". Chiffres présents mais mal placés: "
                    + counterNumberAlmostOk);

            // vérifie la victoire du joueur
            if (counterNumberOk == 4) {
                isCorrect = true;
                System.out.println("Victoire !");
            }

            tentatives++;
        }
        // si le joueur perd
        if (!isCorrect) {
            System.out.println("Dommage. La réponse était : " + Arrays.toString(computerInput));
        }
    }

    /**
     * 
     * @return Renvoie le nombre aléatoire de 4 chiffres entre 0 et 7 à deviner
     */
    public static int[] computerChoice() {
        int[] numbersToGuess = new int[4];
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            numbersToGuess[i] = r.nextInt(8);
        }
        return numbersToGuess;
    }

    /**
     * 
     * @param scanner Les essais du joueur
     * @return Renvoie un tableau de 4 entiers compris entre 0 et 7
     */
    public static int[] playerInput(Scanner scanner) {
        boolean isValid = false;
        int[] playerInput = new int[4];

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
