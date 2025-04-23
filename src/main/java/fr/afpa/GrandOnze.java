package fr.afpa;

import java.util.Arrays;

public class GrandOnze {

    // TODO Je suppose que l'exercice attendait de faire la fusion sans la fonction
    // sort de java
    /**
     * 
     * @param array1 Un tableau d'entiers triés dans l'ordre croissant
     * @param array2 Un tableau d'entiers triés dans l'ordre croissant
     * @return Renvoie un nouveau tableau de taille n1 + n2 trié dans l'ordre
     *         croissant
     */
    public static int[] mergedArray(int[] array1, int[] array2) {
        int taille = array1.length + array2.length;
        int[] result = new int[taille];
        int position = 0;
        for (int i : array1) {
            result[position] = i;
            position++;
        }
        for (int i : array2) {
            result[position] = i;
            position++;
        }
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
        return result;
    }
}
