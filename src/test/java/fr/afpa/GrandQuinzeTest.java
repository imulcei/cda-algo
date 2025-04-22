package fr.afpa;

import org.junit.jupiter.api.Test;

public class GrandQuinzeTest {

    @Test
    public void sommeTableauRecusiveTest() {
        int[] numbers = { 1, 2, 3 };
        int result = GrandQuinze.sommeTableauRecusive(numbers, 0);
        System.out.println(result);
    }

    @Test
    public void insertSymbolStringTest() {
        String str = "Bonjour";
        System.out.println(GrandQuinze.insertSymbolString(str));
    }

}
