package fr.afpa;

import java.util.Random;
import java.util.Scanner;

public class GrandHuit {

    public static void main(String[] args) {
        justePrix();
    }

    // ✅ Nickel
    public static void justePrix() {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int randomNumber = r.nextInt(100);
        int maxTries = 5;
        int i = 1;
        int number = 0;

        do {
            System.out.println("Enter a number between 1 and 100: ");
            number = scanner.nextInt();
            if (i < maxTries) {
                if (number > randomNumber) {
                    System.out.println("Try a smaller number.");
                }

                if (number < randomNumber) {
                    System.out.println("Try a bigger number.");
                }
            }
            i++;

        } while (number != randomNumber && i <= maxTries);

        if (number != randomNumber) {
            System.out.println("Try again.");
        } else {
            System.out.println("Yayyyy! GG.");
        }

        scanner.close();
    }

}
