package fr.afpa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// import java.util.Scanner;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class GrandTroisTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
        System.out.println("Test de l'ubndetnaigvdekfgel");
    }

    @Test
    public void legalAgeTest() {
        assertFalse(GrandTrois.legalAge(2009));
        assertTrue(GrandTrois.legalAge(1998));
    }

    @Test
    public void minMaxText() {

        int[] result = GrandTrois.minMax(1, 3, 4); // résultat doit être [1, 4]

        // test du minimum
        assertEquals(1, result[0]);
        // test du maximum
        assertEquals(4, result[1]);

    }

    @Test
    public void isVoyelleTest() {
        assertFalse(GrandTrois.isVoyelle('c'));
        assertTrue(GrandTrois.isVoyelle('a'));
    }

    @Test
    public void enoughMoneyTest() {

        // appel de la fonction à tester
        assertFalse(GrandTrois.enoughMoney(200, 800));
        assertTrue(GrandTrois.enoughMoney(1000000, 800));

    }

    @Test
    public void participationRateTest() {
        String result1 = GrandTrois.participationRate('c', 0, 1900);
        assertEquals("Le taux de participation est de 20%.", result1);

        String result2 = GrandTrois.participationRate('a', 1, 1900);
        assertEquals("Le taux de participation est de 40%.", result2);

        String result3 = GrandTrois.participationRate('c', 0, 1400);
        assertEquals("Le taux de participation est de 30%.", result3);

        String result4 = GrandTrois.participationRate('c', 5, 1400);
        assertEquals("Le taux de participation est de 50%.", result4);
    }
}
