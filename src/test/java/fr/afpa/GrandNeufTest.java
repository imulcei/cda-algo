package fr.afpa;

import org.junit.jupiter.api.Test;

public class GrandNeufTest {

    @Test
    public void countVoyellesTest() {
        int result = GrandNeuf.countVoyelles("Aaah oooh eeeh");
        System.out.println(result);
    }

    @Test
    public void countMajTest() {
        int result = GrandNeuf.countMaj("Aaah oOoh EeEh");
        System.out.println(result);
    }

    @Test
    public void strToUppercaseTest() {
        String result = GrandNeuf.strToUppercase("AaAh oOoh EeEh");
        System.out.println(result);
    }
}
