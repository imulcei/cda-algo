package fr.afpa;

import org.junit.jupiter.api.Test;

public class GrandOnzeTest {

    @Test
    public void mergedArrayTest() {
        int[] array1 = { 1, 3, 4, 5 };
        int[] array2 = { 2, 4, 6, 8 };
        GrandOnze.mergedArray(array1, array2);

        int[] array3 = { 5, 8, 9 };
        int[] array4 = { 4, 7, 8 };
        GrandOnze.mergedArray(array3, array4);
    }
}
