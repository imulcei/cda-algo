package fr.afpa;

public class GrandDixNeuf {

    /**
     * 
     * @param k Nombre de plus grands éléments demandé
     * @param n Tableau d'entiers n >= k
     * @return Renvoie un tableau d'index des élements les plus grands
     */
    public static int[] biggestElementsIntoArray(int k, int[] n) {
        int[] result = new int[k];
        int j = 0;
        for (int i = 0; i < n.length; i++) {
            if (j < k) {
                result[j] = n[i];
                j++;
            } else {
                int minIndex = findIndexMin(result);
                if (n[i] > result[minIndex]) {
                    result[minIndex] = n[i];
                }
            }
        }
        return result;
    }

    /**
     * 
     * @param array
     * @return Renvoie l'index de la valeur la plus petite
     */
    public static int findIndexMin(int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
