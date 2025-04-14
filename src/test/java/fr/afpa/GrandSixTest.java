package fr.afpa;

import org.junit.jupiter.api.Test;

public class GrandSixTest {
    
    @Test
    public void sumArrayTest() {
        int[][] array2D = { {1, 2, 3}, {4, 5, 6} };
        int result = GrandSix.sumArray(array2D, 3, 2);
        System.out.println(result);
    }
}
