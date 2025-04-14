package fr.afpa;

public class GrandSix {

    public static void main(String[] args) {

    }

    /**
     * 
     * @param array2D Un tableau 2D d'entiers
     * @return Renvoie la somme des entiers du tableau 2D
     */
    public static int sumArray(int[][] array2D) {
        int sum = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                sum += array2D[i][j];
            }
        }
        return sum;
    }

    /**
     * 
     * @param array2D      Tableau d'entiers 2D
     * @param width        Nombre de colonnes dans le tableau
     * @param height       Nombre de lignes dans le tableau
     * @param diagonalType Indique qu'il faut calculer la diagonale 1 ou 2
     * @return Renvoie la somme des entiers du tableau 2D composant la diagonale
     */
    public static int sumDiagonalArray(int[][] array2D, int width, int height, int diagonalType) {
        int sum = 0;
        if (width == height) {
            for (int i = 0; i < height; i++) {
                if (diagonalType == 1) {
                    sum += array2D[i][i];
                } else if (diagonalType == 2) {
                    sum += array2D[i][width - 1 - i];
                }
            }
        }
        return sum;
    }
}
