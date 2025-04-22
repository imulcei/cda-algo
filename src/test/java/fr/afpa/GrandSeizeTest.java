package fr.afpa;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class GrandSeizeTest {

    @Test
    public void bubbleSortTest() {
        int[] array = { 1, 5, 10, 4, 2 };
        System.out.println(Arrays.toString(GrandSeize.bubbleSort(array)));
    }

    @Test
    public void insertionSortTest() {
        int[] array = { 1, 5, 10, 4, 2 };
        System.out.println(Arrays.toString(GrandSeize.insertionSort(array)));
    }

}
