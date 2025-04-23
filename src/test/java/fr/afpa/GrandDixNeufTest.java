package fr.afpa;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class GrandDixNeufTest {
    
    @Test
    public void biggestElementsIntoArrayTest() {
        int[] n = { 1, 23, 12, 9, 30, 2, 50 };
        System.out.println(Arrays.toString(GrandDixNeuf.biggestElementsIntoArray(3, n)));

        int[] n1 = { 11, 5, 12, 9, 44, 17, 2 };
        System.out.println(Arrays.toString(GrandDixNeuf.biggestElementsIntoArray(2, n1)));
    }
}
