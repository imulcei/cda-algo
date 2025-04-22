package fr.afpa;

public class GrandDixSept {

    /**
     * 
     * @param array       Tableau d'entiers positifs triés dans l'ordre croissant
     * @param valueToFind Nombre à trouver dans le tableau
     * @return Renvoie l'index de l'élément si retrouvé, sinon -1
     */
    public static int rechercheDichotomique(int[] array, int valueToFind) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (valueToFind == array[middle]) {
                return middle;
            }
            if (valueToFind < array[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }

}
