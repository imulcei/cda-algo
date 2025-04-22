package fr.afpa;

import org.junit.jupiter.api.Test;

public class GrandDixHuitTest {

    @Test
    public void encryptStringTest() {
        String str = "aime";
        System.out.println(GrandDixHuit.encryptString(str, 3));
    }

    @Test
    public void decryptStringTest() {
        String str = "dlph";
        System.out.println(GrandDixHuit.decryptString(str, 3));
    }
}
