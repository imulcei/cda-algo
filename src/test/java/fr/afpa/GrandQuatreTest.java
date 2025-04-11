package fr.afpa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class GrandQuatreTest {

    @Test
    public void followersYtbOneTest() {
        double result = GrandQuatre.followersYtbOne(2500);
        assertEquals(4489.6408150553225, result);
    }

    @Test
    public void followersYtbTwoTest() {
        double result = GrandQuatre.followersYtbTwo(2500);
        assertEquals(4489.6408150553225, result);
    }

    @Test
    public void addIntegersTest() {
        int result1 = GrandQuatre.addIntegers(3);
        assertEquals(6, result1);

        int result2 = GrandQuatre.addIntegers(10);
        assertEquals(55, result2);
    }

    @Test
    public void fizzBuzzTest() {
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("1");
        expected.add("2");
        expected.add("Fizz");
        expected.add("4");
        expected.add("Buzz");
        expected.add("Fizz");
        expected.add("7");
        expected.add("8");
        expected.add("Fizz");
        expected.add("Buzz");
        expected.add("11");
        expected.add("Fizz");
        expected.add("13");
        expected.add("14");
        expected.add("Fizzbuzz");

        ArrayList<String> results = GrandQuatre.fizzBuzz(15);
        assertIterableEquals(expected, results);
    }

    @Test
    public void arrayIterationTest() {
        System.out.println(GrandQuatre.factorielle(5));
    }
}
