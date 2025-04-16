package fr.afpa;

import java.time.Year;

/**
 * Hello world!
 */
public class GrandTrois {

    /**
     * 
     * @param year Année de naissance de l'utilisateur
     * @return Renvoie si l'utilisateur est majeur ou non
     */
    public static boolean legalAge(int year) {
        int currentYear = Year.now().getValue();
        int age = currentYear - year;
        if (age < 18) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Trouve les valeurs min et max de trois nombres
     * 
     * @param var1 Le premier nombre à considérer
     * @param var2 Le second nombre à considérer
     * @param var3 Le troisième nombre à considérer
     * @return Renvoie un tableau de deux éléments, le premier correspond au minimum
     *         et le second au maximums des trois nombres
     */
    public static int[] minMax(int var1, int var2, int var3) {
        int minVar = var1;
        int maxVar = var1;

        int[] result = new int[2];

        if (var2 < minVar)
            minVar = var2;
        if (var3 < minVar)
            minVar = var3;
        if (var2 > maxVar)
            maxVar = var2;
        if (var3 > maxVar)
            maxVar = var3;

        result[0] = minVar;
        result[1] = maxVar;

        return result;
    }

    /**
     * ✅ okay
     * 
     * @param userLetter Lettre choisie par l'utilisateur
     * @return Renvoie si la lettre de l'utilisateur est une voyelle ou non
     */
    public static boolean isVoyelle(char userLetter) {
        char[] voyelle = { 'a', 'e', 'i', 'o', 'u', 'y' };
        for (int i = 0; i < voyelle.length; i++) {
            if (userLetter == voyelle[i])
                return true;
        }
        return false;
    }

    /**
     * ✅ okay
     * 
     * @param balance Solde bancaire de l'utilisateur
     * @param price   Prix de l'article
     * @return Renvoie si l'utilisateur peut acheter l'article ou non
     */
    public static boolean enoughMoney(double balance, double price) {

        double result = balance - price;

        if (result >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * ✅ okay
     * 
     * @param situation Situation maritale de l'utilisateur
     * @param children  Nombre d'enfants
     * @param salary    Salaire de l'utilisateur
     * @return Renvoie le taux de participation en fonction du profil
     */
    public static String participationRate(char situation, int children, int salary) {
        int rate = 25;
        if (situation == 'C' || situation == 'c') {
            rate = 20;
        }

        for (int i = 0; i < children; i++) {
            rate += 15;
        }

        if (salary < 1800) {
            rate += 10;
        }

        if (rate >= 50) {
            rate = 50;
        }

        return "Le taux de participation est de " + rate + "%.";
    }
}
