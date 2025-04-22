package fr.afpa;

public class GrandSeize {

    /**
     * 
     * @param array
     * @return Renvoie le tableau trié via le tri à bulles.
     */
    public static int[] bubbleSort(int[] array) {
        int temp = 0;
        for (int i = array.length; i >= 2; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    /**
     * 
     * @param array
     * @return Renvoie une tableau trié via le tri par insertion.
     */
    public static int[] insertionSort(int[] array) {
        int j;
        int temp;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            j = i;
            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j = j - 1;
            }
            array[j] = temp;
        }
        return array;
    }
}
