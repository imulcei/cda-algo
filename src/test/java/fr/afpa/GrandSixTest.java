package fr.afpa;

import org.junit.jupiter.api.Test;

public class GrandSixTest {

    @Test
    public void sumArrayTest() {
        int[][] array2D = { { 1, 2, 3 }, { 4, 5, 6 } };
        int result = GrandSix.sumArray(array2D);
        System.out.println(result);
    }

    @Test
    public void sumDiagonalArrayTest() {
        int[][] array2D = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int result = GrandSix.sumDiagonalArray(array2D, 3, 3, 1);
        System.out.println(result);

        int result2 = GrandSix.sumDiagonalArray(array2D, 3, 3, 2);
        System.out.println(result2);
    }
}
