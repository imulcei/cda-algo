package fr.afpa;

import java.util.ArrayList;
import java.util.Arrays;

public class GrandCinq {

    public static void arrayIteration() {
        double[] arrayInt = { 12.2, 11.3, 4.4, 2.0 };
        System.out.println(Arrays.toString(arrayInt));
    }

    /**
     * 
     * @param positiveNum Tableau d'entiers positifs
     * @param value       Entier positif à chercher dans le tableau
     * @return Renvoie l'index de la valeur retrouvée
     */
    public static int sequentialSearchUn(int[] positiveNum, int value) {
        for (int i = 0; i < positiveNum.length; i++) {
            if (value == positiveNum[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int sequentialSearchDeux(int[] positiveNum, int value) {
        int i = 0;
        while (i < positiveNum.length) {
            if (value == positiveNum[i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int sequentialSearchTrois(int[] positiveNum, int value) {
        int i = 0;
        do {
            if (value == positiveNum[i]) {
                return i;
            }
            i++;
        } while (i < positiveNum.length);
        return -1;
    }

    /**
     * 
     * @param arrayIndex Tableau d'entiers
     * @param i          Premier index à considérer
     * @param j          Deuxièment index à considérer
     * @return Renvoie la somme des éléments entre les deux index.
     */
    public static int sumTwoIndex(int[] arrayIndex, int i, int j) {
        int sum = 0;
        for (int k = i; k < j; k++) {
            sum += arrayIndex[k];
        }
        return sum;
    }

    /**
     * 
     * @param array Tableau d'entiers
     * @return Renvoie un tableau d'entiers comprenant 2 éléments, le premier est
     *         l'indice du nombre min et le second est l'indice du nombre max
     */
    public static int[] searchingIndexes(int[] array) {
        int min = 0;
        int max = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
            if (array[i] > array[max]) {
                max = i;
            }
        }

        int[] result = { min, max };
        return result;
    }

    /**
     * Recherche les valeurs maximum et minimum d'un tableau.
     * 
     * ✅ okay
     * 
     * @return Un tableau 1D. Index 0 : min, index 1 : max
     */
    public static double[] searchMinMaxValues(double[] array) {
        double min = array[0];
        double max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        double[] result = { min, max };
        return result;
    }

    /**
     * Solution pour la fonction "searchingIndexes" en utilisant la généricité.
     * 
     * Le 'T' peut être vu comme un joker.
     * C'est le compilateur qui déduira le type en fonction du contexte d'appel.
     * 
     * @param <T>   Le type du tableau à tratier
     * @param array Le tableau à traiter
     * @return La ArrayList résultat
     */
    static public <T extends Number & Comparable<T>> ArrayList<T> searchingIndexes(T[] array) {
        // initialisation des min et max
        T min = array[0];
        T max = array[0];

        for (int i = 1; i < array.length; i++) {
            // Attention : à ce niveau le compilateur ne connait pas le type réel de T
            // c'est normal, cette information n'est connue qu'à l'appel de la fonction
            // nous ne pouvons donc pas utiliser d'opérateur de comparaison ici
            // par contre T hérite de "Comparable<T>"
            // donc T détient la méthode "compareTo"
            // compareTo renvoie un nombre négatif si array[i] est inférieur à min
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }

        ArrayList<T> result = new ArrayList<>();
        result.add(min);
        result.add(max);
        return result;
    }

    /**
     * 
     * @param arrayIndex Tableau à modifier
     * @param i          Premier indice à échanger
     * @param j          Deuxième indice à échanger
     * @return Renvoie true si l'opération d'échange est possible, faux si elle ne
     *         l'est pas
     */
    public static boolean swap(int[] arrayIndex, int i, int j) {
        if ((i <= 0) || (j <= 0)) {
            return false;
        } else {
            int temp = arrayIndex[i];
            arrayIndex[i] = arrayIndex[j];
            arrayIndex[j] = temp;
            System.out.println(Arrays.toString(arrayIndex));
            return true;
        }
    }

    /**
     * 
     * @param array Tableau d'entiers
     * @return Renvoie la moyenne des entiers du tableau.
     */
    public static double average(int[] array) {
        int i = 0;
        double sum = 0;
        do {
            sum += array[i];
            i++;
        } while (i < array.length);

        double result = sum / array.length;
        return result;
    }

    public static double average(double[] array) {
        int i = 0;
        double sum = 0;
        do {
            sum += array[i];
            i++;
        } while (i < array.length);

        double result = sum / array.length;
        return result;
    }

    /**
     * 
     * ✅ okay
     * 
     * @param array Tableau entré par l'utilisateur
     */
    public static double[] manipulateArray(double[] array) {
        double sum = average(array);
        double[] minMaxArray = searchMinMaxValues(array);

        double[] resultArray = { sum, minMaxArray[0], minMaxArray[1] };
        return resultArray;
    }

    /**
     * 
     * ✅ okay
     * 
     * @param arrayIntegers Tableau d'entiers
     * @return Renvoie un tableau d'entiers inversé par rapport à celui en entrée
     */
    public static int[] invert(int[] arrayIntegers) {
        int[] newArrayIntegers = new int[arrayIntegers.length];
        for (int i = 0; i < arrayIntegers.length; i++) {
            newArrayIntegers[arrayIntegers.length - i - 1] = arrayIntegers[i];
        }
        return newArrayIntegers;
    }
}
