package fr.afpa;

public class GrandSix {

    public static void main(String[] args) {

    }

    public static int sumArray(int[][] array2D) {
        int sum = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                sum += array2D[i][j];
            }
        }
        return sum;
    }
}
