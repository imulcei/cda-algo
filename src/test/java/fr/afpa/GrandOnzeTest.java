package fr.afpa;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class GrandOnzeTest {

    @Test
    public void mergedArrayTest() {
        int[] array1 = { 1, 3, 4, 5 };
        int[] array2 = { 2, 4, 6, 8 };
        GrandOnze.mergedArray(array1, array2);
        int[] expectedArray = { 1, 2, 3, 4, 4, 5, 6, 8 };
        assertArrayEquals(expectedArray, GrandOnze.mergedArray(array1, array2));

        int[] array3 = { 5, 8, 9 };
        int[] array4 = { 4, 7, 8 };
        GrandOnze.mergedArray(array3, array4);
        int[] expectedArray2 = { 4, 5, 7, 8, 8, 9 };
        assertArrayEquals(expectedArray2, GrandOnze.mergedArray(array3, array4));
    }
}
