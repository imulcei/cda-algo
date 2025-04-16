package fr.afpa;

import java.util.ArrayList;

public class GrandQuatre {

    public static void main(String[] args) {

    }

    /**
     * ✅ okay
     * @param followers Nombre de followers au jour 1
     * @return Renvoie le nombre de followers estimé au bout de 12 mois
     */
    public static double followersYtbOne(int followers) {
        double monthlyIncrease = 0.05;
        int months = 0;
        double followersOneYear = followers;
        while (months < 12) {
            followersOneYear += followersOneYear * monthlyIncrease;
            months++;
        }
        return followersOneYear;
    }

    // ✅ okay
    public static double followersYtbTwo(int followers) {
        double monthlyIncrease = 0.05;
        double followersOneYear = followers;
        for (int months = 0; months < 12; months++) {
            followersOneYear += followersOneYear * monthlyIncrease;
        }
        return followersOneYear;
    }

    /**
     * 
     * @param number Entier choisi par l'utilisateur
     * @return Renvoie un entier correspondant à la somme des entiers de 0 à number
     */
    public static int addIntegers(int number) {
        int result = 0;
        int intNumber = 1;
        // TODO serait-il possible d'avoir une solution sans l'utilisation d'une variable telle que "intNumber" ?
        for (int i = 0; i < number; i++) {
            result = result + intNumber;
            intNumber++;
        }
        return result;
    }

    /**
     * ✅ okay
     * @param number Entier choisi par l'utilisateur
     * @return Renvoie Fizz si l'entier est divisible par 3, Buzz si l'entier est
     *         divisible par 5, Fizzbuzz si l'entier est divisible par 3 et 5.
     */
    public static ArrayList<String> fizzBuzz(int number) {

        ArrayList<String> resultList = new ArrayList<String>();

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizzbuzz");
                resultList.add("Fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                resultList.add("Fizz");

            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                resultList.add("Buzz");
            } else {
                String numberStr = Integer.toString(i);
                System.out.println(numberStr);
                resultList.add(numberStr);
            }
        }
        return resultList;
    }

    /**
     * ✅ okay
     * @param number Entier choisi par l'utilisateur
     * @return Renvoie la factorielle de l'entier number
     */
    public static int factorielle(int number) {
        int facto = 1;
        for (int i = 1; i <= number; i++) {
            facto = facto * i;
        }
        return facto;
    }
}
