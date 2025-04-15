package fr.afpa;

import java.util.Arrays;

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

    @Test
    public void strMirrorTest() {
        String result = GrandNeuf.strMirror("J'aime les lasagnes");
        System.out.println(result);
    }

    @Test
    public void strToCamelCaseTest() {
        String result = GrandNeuf.strToCamelCase("J'aime les lasagnes");
        System.out.println(result);

        String result2 = GrandNeuf.strToCamelCase("Maman aime le poulet");
        System.out.println(result2);
    }

    @Test
    public void locateStringTest() {
        int[] result = GrandNeuf.locateString("J'aime les lasagnes", "les");
        System.out.println(Arrays.toString(result));

        int[] result2 = GrandNeuf.locateString("J'aime les lasagnes", "aime");
        System.out.println(Arrays.toString(result2));
    }
}
