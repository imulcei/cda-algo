package fr.afpa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GrandDixTest {

    @Test
    public void conversionBaseDixTest() {
        int res = GrandDix.conversionBaseDix("0110");
        System.out.println(res);
        assertEquals(6, res);

        int res1 = GrandDix.conversionBaseDix("1101");
        System.out.println(res1);
        assertEquals(13, res1);

        int res2 = GrandDix.conversionBaseDix("0011");
        System.out.println(res2);
        assertEquals(3, res2);
    }

    @Test
    public void conversionBinaireTest() {
        String res = GrandDix.conversionBinaire(10);
        System.out.println(res);
        assertEquals("1010", res);
    }
}
