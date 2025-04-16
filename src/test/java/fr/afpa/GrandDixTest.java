package fr.afpa;

import org.junit.jupiter.api.Test;

public class GrandDixTest {

    @Test
    public void conversionBaseDixTest() {
        int res = GrandDix.conversionBaseDix("0110");
        System.out.println(res);
    } 
}
