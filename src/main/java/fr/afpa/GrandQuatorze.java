package fr.afpa;

import java.util.Arrays;

public class GrandQuatorze {

    /**
     * 
     * @param monnaie
     * @return Renvoie un tableau indiquant le nombre de pièces pour chaque valeur
     *         de pièce pour rendre la monnaie de manière optimale, avec le moins de
     *         pièces possibles.
     */
    public static int[] algorithmeGlouton(double monnaie) {
        int monnaieCents = (int) Math.round(monnaie * 100);
        double[] coins = { 200, 100, 50, 20, 10, 5, 2, 1 };
        int[] result = new int[coins.length];
        int i = 0;
        while (monnaieCents > 0 && i < coins.length) {
            if (monnaieCents >= coins[i]) {
                result[i]++;
                monnaieCents -= coins[i];
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
