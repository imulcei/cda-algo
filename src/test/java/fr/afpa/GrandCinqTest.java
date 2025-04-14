package fr.afpa;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class GrandCinqTest {

    @Test
    public void arrayIterationTest() {
        GrandCinq.arrayIteration();
    }

    @Test
    public void sequentialSearchUnTest() {
        int[] positiveNum = { 1, 2, 3, 4, 5, 6 };
        System.out.println(GrandCinq.sequentialSearchUn(positiveNum, 3));
    }

    @Test
    public void sequentialSearchDeuxTest() {
        int[] positiveNum = { 1, 2, 3, 4, 5, 6 };
        System.out.println(GrandCinq.sequentialSearchDeux(positiveNum, 3));
    }

    @Test
    public void sequentialSearchTroisTest() {
        int[] positiveNum = { 1, 2, 3, 4, 5, 6 };
        System.out.println(GrandCinq.sequentialSearchTrois(positiveNum, 5));
    }

    @Test
    public void sumTwoIndexTest() {
        int[] positiveNum = { 1, 2, 3, 4, 5, 6 };
        System.out.println(GrandCinq.sumTwoIndex(positiveNum, 2, 1));
    }

    @Test
    public void searchingIndexesTest() {
        int[] positiveNum = { 1, 2, 3, 4, 5, 6 };
        int[] resultArray = GrandCinq.searchingIndexes(positiveNum);
        System.out.println(Arrays.toString(resultArray));
    }

    @Test
    public void swapTest() {
        int[] positiveNum = { 1, 2, 3, 4, 5, 6 };
        GrandCinq.swap(positiveNum, 1, 3);
    }

    @Test
    public void averageTest() {
        int[] positiveNum = { 1, 2, 3, 4, 5, 6 };
        System.out.println(GrandCinq.average(positiveNum));
    }

    @Test
    public void manipulateArrayTest() {
        double[] positiveNum = { 1, 2, 3, 4, 5, 6 };
        double[] result = GrandCinq.manipulateArray(positiveNum);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void invertTest() {
        int[] positiveNum = { 1, 2, 3, 4, 5, 6 };
        int[] result = GrandCinq.invert(positiveNum);
        System.out.println(Arrays.toString(result));
    }
}
