package fr.afpa;

import org.junit.jupiter.api.Test;

public class GrandDixSeptTest {

    @Test
    public void rechercheDichotomiqueTest() {
        int[] array = { 2, 6, 10, 34, 98 };
        System.out.println(GrandDixSept.rechercheDichotomique(array, 34));
    }
}
