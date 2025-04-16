package fr.afpa;

import org.junit.jupiter.api.Test;

public class GrandDixTest {

    @Test
    public void conversionBaseDixTest() {
        // TODO mettre des "assert" pour valider les valeurs retournées par les fonctions
        int res = GrandDix.conversionBaseDix("0110");
        System.out.println(res);

        int res1 = GrandDix.conversionBaseDix("1101");
        System.out.println(res1);

        int res2 = GrandDix.conversionBaseDix("0011");
        System.out.println(res2);
    }

    @Test
    public void conversionBinaireTest() {
        // TODO mettre des "assert" pour valider les valeurs retournées par les fonctions

        String res = GrandDix.conversionBinaire(0);
        System.out.println(res);
    }
}
