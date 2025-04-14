package fr.afpa;

public class GrandSix {

    public static void main(String[] args) {

    }

    public static int sumArray(int[] array2D, int width, int height) {
        int sum = 0;
        for (int i : array2D) {
            sum += array2D[i];
        }
        return sum;
    }
}
